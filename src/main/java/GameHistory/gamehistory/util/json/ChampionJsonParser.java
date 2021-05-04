package GameHistory.gamehistory.util.json;

import com.google.gson.JsonObject;
import org.json.JSONException;
import org.json.JSONObject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class ChampionJsonParser {

    public JSONObject getChampionJson() {

        String Json_url = "http://ddragon.leagueoflegends.com/cdn/11.8.1/data/ko_KR/champion.json";

        HttpURLConnection conn = null;
        JSONObject responseJson = null;

        try {
            URL url = new URL(Json_url);

            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            JSONObject commands = new JSONObject();

            if (conn.getResponseCode() == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line = "";
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                responseJson = new JSONObject(sb.toString());

            } else {
                System.out.println("response is error : " + conn.getResponseCode());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            System.out.println("not JSON Format response");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return responseJson;
    }

    public static Object getChampionName(Map<String, Object> championJson, Object championId) {

        for (String key : championJson.keySet()) {

            System.out.println("id : " + key.toString() + " Champion Name : " + ((Map)championJson.get(key)).get("id"));
            if (((Map)championJson.get(key)).get("key").toString().equals(championId.toString())) {

                return ((Map)championJson.get(key)).get("id");
            }
        }

        return null;
    }

}
