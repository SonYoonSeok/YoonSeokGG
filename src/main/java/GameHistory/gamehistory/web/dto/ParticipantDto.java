package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParticipantDto {

    private int participantId;
    private int championId;
    private List<RuneDto> runes;
    private ParticipantStatsDto stats;
    private int teamId;
    private ParticipantTimelineDto timeline;
    private int spell1Id;
    private int spell2Id;
    private String highestAchievedSeasonTier;
    private List<MasteryDto> masteries;

    public ParticipantDto() {
    }

    public ParticipantDto(int participantId, int championId, List<RuneDto> runes, ParticipantStatsDto stats, int teamId, ParticipantTimelineDto timeline, int spell1Id, int spell2Id, String highestAchievedSeasonTier, List<MasteryDto> masteries) {
        this.participantId = participantId;
        this.championId = championId;
        this.runes = runes;
        this.stats = stats;
        this.teamId = teamId;
        this.timeline = timeline;
        this.spell1Id = spell1Id;
        this.spell2Id = spell2Id;
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
        this.masteries = masteries;
    }
}
