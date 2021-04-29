package GameHistory.gamehistory.web;

import GameHistory.gamehistory.util.LeagueEntryParser;
import GameHistory.gamehistory.util.MatchListParser;
import GameHistory.gamehistory.util.MatchParser;
import GameHistory.gamehistory.util.SummonerParser;
import GameHistory.gamehistory.util.json.ChampionJsonParser;
import GameHistory.gamehistory.web.dto.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URL;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @Autowired
    SummonerParser summonerParser = new SummonerParser();

    @Autowired
    LeagueEntryParser leagueEntryParser = new LeagueEntryParser();

    @Autowired
    MatchListParser matchListParser = new MatchListParser();

    @Autowired
    MatchParser matchParser = new MatchParser();

    @RequestMapping("/summoner/{name}")
    public String summoner(@PathVariable String name, Model model) {

        //Champion JSON
        ChampionJsonParser championJsonParser = new ChampionJsonParser();
        JSONObject championJsonObject = championJsonParser.getChampionJson();   //VO 클래스 만들어야됨
//        JSONObject championJsonData = championJsonObject.getJSONObject("data");
//        System.out.println(championJsonData.get("Gragas"));

        //Summoner
        SummonerDto summonerDto = new SummonerDto();
        summonerDto = summonerParser.requestSummoner(name);

        //League Entry
        List<LeagueEntryDto> leagueEntryDto = leagueEntryParser.requestLeagueEntry(summonerDto.getId());

        //MatchList
        MatchlistDto matchlistDto = new MatchlistDto();
        matchlistDto = matchListParser.requestMatchList(summonerDto.getAccountId());
        List<MatchReferenceDto> matches = matchlistDto.getMatches();

        //Match
        MatchDto matchDto = new MatchDto(); //이거 리스트로 만들어야됨
        matchDto = matchParser.requestMatch(matches.get(0).getGameId());

        int participantIndex = -1;
        for (int i = 0; i < 10; i++) {
            if (matchDto.getParticipantIdentities().get(i).getPlayer().getSummonerName().equals(summonerDto.getName())) {
                participantIndex = matchDto.getParticipantIdentities().get(i).getParticipantId();
                break;
            }
        }
        participantIndex -= 1;
        ParticipantDto participantDto = matchDto.getParticipants().get(participantIndex);
        ParticipantStatsDto participantStatsDto = matchDto.getParticipants().get(participantIndex).getStats();

        //Team
        System.out.println(summonerDto.toString());

        if (leagueEntryDto.size() == 1) {
            System.out.println(leagueEntryDto.get(0).getQueueType() + " : " + leagueEntryDto.get(0).getTier());
            //LeagueEntryDto leagueEntryFlex = new LeagueEntryDto(null, null, null, null, "RANKED_FLEX_SR", "UNRANKED", 0, 0, 0, false, false, false, false, null);
            model.addAttribute("LeagueEntry", leagueEntryDto);

        } else if (leagueEntryDto.size() == 2){
            System.out.println(leagueEntryDto.get(1).getQueueType() + " : " + leagueEntryDto.get(1).getTier());
            System.out.println(leagueEntryDto.get(0).getQueueType() + " : " + leagueEntryDto.get(0).getTier());
            model.addAttribute("LeagueEntry", leagueEntryDto);

        }

        model.addAttribute("Summoner", summonerDto);
        model.addAttribute("TotalMatch", matchlistDto);
        model.addAttribute("Matches", matches);
        model.addAttribute("Match", matchDto);
        model.addAttribute("Participant", participantDto);
        model.addAttribute("ParticipantStats", participantStatsDto);

        return "findSummoner";
    }

}
