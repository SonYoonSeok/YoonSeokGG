package GameHistory.gamehistory.web;

import GameHistory.gamehistory.util.LeagueEntryParser;
import GameHistory.gamehistory.util.MatchListParser;
import GameHistory.gamehistory.util.SummonerParser;
import GameHistory.gamehistory.web.dto.LeagueEntryDto;
import GameHistory.gamehistory.web.dto.MatchlistDto;
import GameHistory.gamehistory.web.dto.SummonerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

        //Match
        MatchlistDto matchlistDto = new MatchlistDto();
        MatchListParser matchListParser = new MatchListParser();
        matchlistDto = matchListParser.requestMatchList(summonerDto.getAccountId());

        System.out.println(summonerDto.toString());
        System.out.println(leagueEntryDto.toString());

        model.addAttribute("Summoner", summonerDto);
        model.addAttribute("LeagueEntry", leagueEntryDto);
        model.addAttribute("MatchList", matchlistDto);

        return "findSummoner";
    }

}
