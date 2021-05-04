package GameHistory.gamehistory.util;

import GameHistory.gamehistory.web.dto.ViewMatchDto;

public class ViewMatchParser {

    public ViewMatchDto setViewMatch(int championId, String championName, int kills, int deaths, int assists, boolean win, int item0, int item1, int item2, int item3, int item4, int item5) {

        ViewMatchDto matchDto = new ViewMatchDto();

        matchDto.setChampionId(championId);
        matchDto.setChampionName(championName);
        matchDto.setKills(kills);
        matchDto.setDeaths(deaths);
        matchDto.setAssists(assists);
        matchDto.setWin(win);
        matchDto.setItem0(item0);
        matchDto.setItem1(item1);
        matchDto.setItem2(item2);
        matchDto.setItem3(item3);
        matchDto.setItem4(item4);
        matchDto.setItem5(item5);

        return matchDto;
    }
}
