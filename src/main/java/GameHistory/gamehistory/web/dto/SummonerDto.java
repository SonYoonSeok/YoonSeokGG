package GameHistory.gamehistory.web.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SummonerDto {

    private String accountId;
    private int profileIconId;
    private Long revisionDate;
    private String name;
    private String id;
    private String puuid;
    private Long summonerLevel;

    public SummonerDto() { }
    public SummonerDto(String accountId, int profileIconId, Long revisionDate, String name, String id, String puuid, Long summonerLevel) {
        this.accountId = accountId;
        this.profileIconId = profileIconId;
        this.revisionDate = revisionDate;
        this.name = name;
        this.id = id;
        this.puuid = puuid;
        this.summonerLevel = summonerLevel;
    }

    @Override
    public String toString() {
        return "Summoner Data [accountId=" + accountId + ", profileIconId=" + profileIconId + ", revisonDate=" + revisionDate + ", name=" + name + ", id=" + id + ", puuid=" + puuid
                + ", summonerLevel=" + summonerLevel + "]";
    }
}
