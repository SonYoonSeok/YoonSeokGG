package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchReferenceDto {

    private Long gameId;
    private String role;
    private int season;
    private String platformId;
    private int champion;
    private int queue;
    private String lane;
    private Long timestamp;

    public MatchReferenceDto() { }

    public MatchReferenceDto(Long gameId, String role, int season, String platformId, int champion, int queue, String lane, Long timestamp) {
        this.gameId = gameId;
        this.role = role;
        this.season = season;
        this.platformId = platformId;
        this.champion = champion;
        this.queue = queue;
        this.lane = lane;
        this.timestamp = timestamp;
    }
}
