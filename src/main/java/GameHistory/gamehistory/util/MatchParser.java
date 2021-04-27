package GameHistory.gamehistory.util;

import GameHistory.gamehistory.web.dto.MatchDto;
import GameHistory.gamehistory.web.dto.MatchlistDto;
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
public class MatchParser {

    @Value("${api.key}")
    private String api_Key;

    public MatchDto requestMatch(Long matchId) {
        ObjectMapper objectMapper = new ObjectMapper();
        MatchDto matchDto = new MatchDto();

        final String request_Url = "https://kr.api.riotgames.com/lol/match/v4/matches/" + matchId + "?api_key=" + api_Key;
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet getRequest = new HttpGet(request_Url);
            HttpResponse response = client.execute(getRequest);

            if (response.getStatusLine().getStatusCode() == 200) {
                ResponseHandler<String> handler = new BasicResponseHandler();
                String body = handler.handleResponse(response);
                matchDto = objectMapper.readValue(body, MatchDto.class);

            } else {
                System.out.println("Match response is error : " + response.getStatusLine().getStatusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return matchDto;

    }
}
