package GameHistory.gamehistory.util;

import GameHistory.gamehistory.web.dto.LeagueEntryDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LeagueEntryParser {

    @Value("${api.key}")
    private String api_Key;

    public List<LeagueEntryDto> requestLeagueEntry(String id) {

        ObjectMapper objectMapper = new ObjectMapper();
        //Map<String, Object> params;

        List<LeagueEntryDto> leagueEntryDto = null;

        final String request_Url = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/" + id + "?api_key=" + api_Key;
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet getRequest = new HttpGet(request_Url);
            HttpResponse response = client.execute(getRequest);

            if (response.getStatusLine().getStatusCode() == 200) {
                ResponseHandler<String> handler = new BasicResponseHandler();
                String body = handler.handleResponse(response);
                //body = body.substring(1, body.length() - 1);

                leagueEntryDto = objectMapper.readValue(body, TypeFactory.defaultInstance().constructCollectionType(List.class, LeagueEntryDto.class));

            } else {
                System.out.println(" League Entry response is error : " + response.getStatusLine().getStatusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return leagueEntryDto;

    }
}
