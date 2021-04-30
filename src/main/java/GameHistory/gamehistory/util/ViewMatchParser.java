package GameHistory.gamehistory.util;

import GameHistory.gamehistory.web.dto.ViewMatchDto;

public class ViewMatchParser {

    public ViewMatchDto setViewMatch(int championId, int kills, int deaths, int assists, boolean win) {

        ViewMatchDto matchDto = new ViewMatchDto();

        matchDto.setChampionId(championId);
        matchDto.setKills(kills);
        matchDto.setDeaths(deaths);
        matchDto.setAssists(assists);
        matchDto.setWin(win);

        return matchDto;
    }
}
