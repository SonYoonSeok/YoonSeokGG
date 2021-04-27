package GameHistory.gamehistory.util;

import GameHistory.gamehistory.web.dto.SummonerDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SummonerParser {

    @Value("${api.key}")
    private String api_Key;

    public SummonerDto requestSummoner(String name) {
        ObjectMapper objectMapper = new ObjectMapper();
        SummonerDto summonerDto = null;

        name = name.replaceAll(" ", "%20");

        System.out.println(api_Key);

        final String request_Url = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + name + "?api_key=" + api_Key;
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet getRequest = new HttpGet(request_Url);
            HttpResponse response = client.execute(getRequest);

            if (response.getStatusLine().getStatusCode() == 200) {
                ResponseHandler<String> handler = new BasicResponseHandler();
                String body = handler.handleResponse(response);
                summonerDto = objectMapper.readValue(body, SummonerDto.class);

            } else {
                System.out.println("Summoner response is error : " + response.getStatusLine().getStatusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return summonerDto;

    }
}
