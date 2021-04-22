package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamStatsDto {

    private int towerKills;
    private int riftHeraldKills;
    private boolean firstBlood;
    private int inhibitorKills;
    private List<TeamBansDto> bans;
    private boolean firstBaron;
    private boolean firstDragon;
    private int dominionVictoryScore;
    private int dragonKills;
    private int baronKills;
    private boolean firstInhibitor;
    private boolean firstTower;
    private int vilemawKills;
    private boolean firstRiftHerald;
    private int teamId;
    private String win;

    public TeamStatsDto() {
    }

    public TeamStatsDto(int towerKills, int riftHeraldKills, boolean firstBlood, int inhibitorKills, List<TeamBansDto> bans, boolean firstBaron, boolean firstDragon, int dominionVictoryScore, int dragonKills, int baronKills, boolean firstInhibitor, boolean firstTower, int vilemawKills, boolean firstRiftHerald, int teamId, String win) {
        this.towerKills = towerKills;
        this.riftHeraldKills = riftHeraldKills;
        this.firstBlood = firstBlood;
        this.inhibitorKills = inhibitorKills;
        this.bans = bans;
        this.firstBaron = firstBaron;
        this.firstDragon = firstDragon;
        this.dominionVictoryScore = dominionVictoryScore;
        this.dragonKills = dragonKills;
        this.baronKills = baronKills;
        this.firstInhibitor = firstInhibitor;
        this.firstTower = firstTower;
        this.vilemawKills = vilemawKills;
        this.firstRiftHerald = firstRiftHerald;
        this.teamId = teamId;
        this.win = win;
    }
}
