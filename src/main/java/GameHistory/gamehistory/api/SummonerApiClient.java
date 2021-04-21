package GameHistory.gamehistory.api;

import GameHistory.gamehistory.web.dto.SummonerDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.http.client.ResponseHandler;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

@RequiredArgsConstructor
@Service
public class SummonerApiClient {

    @Autowired
    RestTemplate restTemplate;

    private final String api_Key = "RGAPI-c223b4ee-01eb-4b74-9c1d-e7916d522227";

    public SummonerDto requestSummoner(String name) {
        ObjectMapper objectMapper = new ObjectMapper();
        SummonerDto summonerDto = null;

        name = name.replaceAll(" ", "%20");

        final String request_Url = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + name + "?api_key=" + api_Key;
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet getRequest = new HttpGet(request_Url);
            HttpResponse response = client.execute(getRequest);

            if (response.getStatusLine().getStatusCode() == 200) {
                ResponseHandler<String> handler = new BasicResponseHandler();
                String body = handler.handleResponse(response);
                summonerDto = objectMapper.readValue(body, SummonerDto.class);
                System.out.println("닉네임 : " + summonerDto.getName() + " 레벨 : " + summonerDto.getSummonerLevel());

            } else {
                System.out.println("response is error : " + response.getStatusLine().getStatusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return summonerDto;

    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
