package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MatchDto {

    private Long gameId;
    private List<ParticipantIdentityDto> participantIdentities;
    private int queueId;
    private String gameType;
    private Long gameDuration;
    private List<TeamStatsDto> teams;
    private String platformId;
    private Long gameCreation;
    private int seasonId;
    private String gameVersion;
    private int mapId;
    private String gameMode;
    private List<ParticipantDto> participants;

    public MatchDto() {
    }

    public MatchDto(Long gameId, List<ParticipantIdentityDto> participantIdentities, int queueId, String gameType, Long gameDuration, List<TeamStatsDto> teams, String platformId, Long gameCreation, int seasonId, String gameVersion, int mapId, String gameMode, List<ParticipantDto> participants) {
        this.gameId = gameId;
        this.participantIdentities = participantIdentities;
        this.queueId = queueId;
        this.gameType = gameType;
        this.gameDuration = gameDuration;
        this.teams = teams;
        this.platformId = platformId;
        this.gameCreation = gameCreation;
        this.seasonId = seasonId;
        this.gameVersion = gameVersion;
        this.mapId = mapId;
        this.gameMode = gameMode;
        this.participants = participants;
    }
}
