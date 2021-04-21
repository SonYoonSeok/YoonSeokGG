package GameHistory.gamehistory.web;

import GameHistory.gamehistory.service.summoner.SummonersService;
import GameHistory.gamehistory.web.dto.SummonerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RiotApiController {

    private final SummonersService summonersService;

    ///api/v1/summoners/{name}
}
