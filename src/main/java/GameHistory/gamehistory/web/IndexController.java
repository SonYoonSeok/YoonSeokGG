package GameHistory.gamehistory.web;

import GameHistory.gamehistory.util.*;
import GameHistory.gamehistory.util.json.ChampionJsonParser;
import GameHistory.gamehistory.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.List;

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
        JSONObject championJsonObject = championJsonParser.getChampionJson();
        JSONObject championJsonData = championJsonObject.getJSONObject("data");

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
        List<ViewMatchDto> viewMatchDto = new ArrayList<>();
        List<MatchDto> matchDto = new ArrayList<>();
        List<ParticipantDto> participantDto = new ArrayList<>();
        List<ParticipantStatsDto> participantStatsDto = new ArrayList<>();
        for (int i = 0; i < matchlistDto.getEndIndex(); i++) {
            matchDto.add(matchParser.requestMatch(matches.get(i).getGameId()));

        }

        int participantIndex = -1;
        for (int i = 0; i < matchlistDto.getEndIndex(); i++) {
            for (int j = 0; j < 10; j++) {
                //System.out.println(matchDto.get(i).getParticipantIdentities().get(j).getPlayer().getSummonerName());
                if (matchDto.get(i).getParticipantIdentities().get(j).getPlayer().getSummonerName().equals(summonerDto.getName())) {
                    ViewMatchParser viewMatchParser = new ViewMatchParser();
                    ViewMatchDto vmd = new ViewMatchDto();
                    ParticipantStatsDto psd = new ParticipantStatsDto();

                    participantIndex = matchDto.get(i).getParticipantIdentities().get(j).getParticipantId() - 1;
                    participantDto.add(matchDto.get(i).getParticipants().get(participantIndex));
                    participantStatsDto.add(matchDto.get(i).getParticipants().get(participantIndex).getStats());

                    psd = matchDto.get(i).getParticipants().get(participantIndex).getStats();
                    vmd = viewMatchParser.setViewMatch(matches.get(i).getChampion(), psd.getKills(), psd.getDeaths(), psd.getAssists(), psd.isWin());

                    viewMatchDto.add(vmd);
                    break;
                }
            }
        }
        //ParticipantDto participantDto = matchDto.getParticipants().get(participantIndex);
        //ParticipantStatsDto participantStatsDto = matchDto.getParticipants().get(participantIndex).getStats();

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
        model.addAttribute("VMD", viewMatchDto);
        model.addAttribute("Participant", participantDto);
        model.addAttribute("ParticipantStats", participantStatsDto);

        return "findSummoner";
    }

}
