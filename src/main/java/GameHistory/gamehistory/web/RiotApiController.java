package GameHistory.gamehistory.web;

import GameHistory.gamehistory.service.summoner.SummonersService;
import GameHistory.gamehistory.web.dto.SummonerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RiotApiController {

    private final SummonersService summonersService;

    @GetMapping("/api/v1/summoners/{name}")
    public SummonerDto getSummoner(@PathVariable String name) {
        return summonersService.findBySummoner(name);
    }
}
