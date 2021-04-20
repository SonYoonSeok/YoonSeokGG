package GameHistory.gamehistory.service.summoner;

import GameHistory.gamehistory.api.SummonerApiClient;
import GameHistory.gamehistory.web.dto.SummonerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class SummonersService {
    private final SummonerApiClient summonerApiClient;

    @Transactional(readOnly = true)
    public SummonerDto findBySummoner(String name) {
        return summonerApiClient.requestSummoner(name);
    }
}
