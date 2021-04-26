package GameHistory.gamehistory.util;

import GameHistory.gamehistory.web.dto.MatchlistDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

public class MatchListParser {

    private String api_Key = "RGAPI-d693c860-169b-40ac-a701-7dcf31a63a44";

    public MatchlistDto requestMatchList(String accountId) {
        ObjectMapper objectMapper = new ObjectMapper();
        MatchlistDto matchlistDto = null;

        final String request_Url = "https://kr.api.riotgames.com/lol/match/v4/matchlists/by-account/" + accountId + "?endIndex=10&api_key=" + api_Key;
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet getRequest = new HttpGet(request_Url);
            HttpResponse response = client.execute(getRequest);

            if (response.getStatusLine().getStatusCode() == 200) {
                ResponseHandler<String> handler = new BasicResponseHandler();
                String body = handler.handleResponse(response);
                matchlistDto = objectMapper.readValue(body, MatchlistDto.class);

            } else {
                System.out.println("MatchList response is error : " + response.getStatusLine().getStatusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return matchlistDto;

    }
}
