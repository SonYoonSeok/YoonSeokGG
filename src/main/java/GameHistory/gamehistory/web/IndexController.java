package GameHistory.gamehistory.web;

import GameHistory.gamehistory.util.LeagueEntryParser;
import GameHistory.gamehistory.util.MatchListParser;
import GameHistory.gamehistory.util.MatchParser;
import GameHistory.gamehistory.util.SummonerParser;
import GameHistory.gamehistory.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/summoner/{name}")
    public String summoner(@PathVariable String name, Model model) {

        //Summoner
        SummonerDto summonerDto = new SummonerDto();
        SummonerParser summonerParser = new SummonerParser();
        summonerDto = summonerParser.requestSummoner(name);

        //League Entry
        LeagueEntryDto leagueEntryDto = new LeagueEntryDto();
        LeagueEntryParser leagueEntryParser = new LeagueEntryParser();
        leagueEntryDto = leagueEntryParser.requestLeagueEntry(summonerDto.getId());

        //MatchList
        MatchlistDto matchlistDto = new MatchlistDto();
        MatchListParser matchListParser = new MatchListParser();
        matchlistDto = matchListParser.requestMatchList(summonerDto.getAccountId());
        List<MatchReferenceDto> matchLists = matchlistDto.getMatches();

        //Match
        MatchDto matchDto = new MatchDto();
        MatchParser matchParser = new MatchParser();
        matchDto = matchParser.requestMatch(matchLists.get(0).getGameId());

        System.out.println(summonerDto.toString());
        System.out.println(leagueEntryDto.toString());

        model.addAttribute("Summoner", summonerDto);
        model.addAttribute("LeagueEntry", leagueEntryDto);
        model.addAttribute("TotalMatch", matchlistDto);
        model.addAttribute("MatchLists", matchLists);
        model.addAttribute("Match", matchDto);

        return "findSummoner";
    }

}
