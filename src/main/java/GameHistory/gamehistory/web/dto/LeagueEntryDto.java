package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeagueEntryDto {

    private String leagueId;
    private String summonerId;
    private String summonerName;
    private String queueType;
    private String tier;
    private String rank;
    private int leaguePoints;
    private int wins;
    private int losses;
    private boolean hotStreak;
    private boolean veteran;
    private boolean freshBlood;
    private boolean inactive;

    public LeagueEntryDto() {}
    public LeagueEntryDto(String leagueId, String summonerId, String summonerName, String queueType, String tier, String rank, int leaguePoints, int wins, int losses, boolean hotStreak, boolean veteran, boolean freshBlood, boolean inactive) {
        this.leagueId = leagueId;
        this.summonerId = summonerId;
        this.summonerName = summonerName;
        this.queueType = queueType;
        this.tier = tier;
        this.rank = rank;
        this.leaguePoints = leaguePoints;
        this.wins = wins;
        this.losses = losses;
        this.hotStreak = hotStreak;
        this.veteran = veteran;
        this.freshBlood = freshBlood;
        this.inactive = inactive;
    }

    @Override
    public String toString() {
        return "LeagueEntry Data [leaguetId=" + leagueId + ", summonerId=" + summonerId + ", summonerName=" + summonerName + ", queueType=" + queueType + ", tier=" + tier
                + ", rank=" + rank + ", leaguePoints=" + leaguePoints + ", wins=" + wins + ", losses=" + losses + ", hotStreak=" + hotStreak + "]";
    }
}
