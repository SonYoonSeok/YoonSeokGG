package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDto {
    private int profileIcon;
    private int accountId;
    private String matchHistoryUri;
    private String currentAccountId;
    private String currentPlatformId;
    private String summonerName;
    private String summonerId;
    private String platformId;

    public PlayerDto() {
    }

    public PlayerDto(int profileIcon, int accountId, String matchHistoryUri, String currentAccountId, String currentPlatformId, String summonerName, String summonerId, String platformId) {
        this.profileIcon = profileIcon;
        this.accountId = accountId;
        this.matchHistoryUri = matchHistoryUri;
        this.currentAccountId = currentAccountId;
        this.currentPlatformId = currentPlatformId;
        this.summonerName = summonerName;
        this.summonerId = summonerId;
        this.platformId = platformId;
    }
}
