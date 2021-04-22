package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class ParticipantTimelineDto {

    private int participantId;
    private Map<String, Double> csDiffPerMinDeltas;
    private Map<String, Double> damageTakenPerMinDeltas;
    private String role;
    private Map<String, Double> damageTakenDiffPerMinDeltas;
    private Map<String, Double> xpPerMinDeltas;
    private Map<String, Double> xpDiffPerMinDeltas;
    private String lane;
    private Map<String, Double> creepsPerMinDeltas;
    private Map<String, Double> goldPerMinDeltas;

    public ParticipantTimelineDto() {
    }

    public ParticipantTimelineDto(int participantId, Map<String, Double> csDiffPerMinDeltas, Map<String, Double> damageTakenPerMinDeltas, String role, Map<String, Double> damageTakenDiffPerMinDeltas, Map<String, Double> xpPerMinDeltas, Map<String, Double> xpDiffPerMinDeltas, String lane, Map<String, Double> creepsPerMinDeltas, Map<String, Double> goldPerMinDeltas) {
        this.participantId = participantId;
        this.csDiffPerMinDeltas = csDiffPerMinDeltas;
        this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
        this.role = role;
        this.damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas;
        this.xpPerMinDeltas = xpPerMinDeltas;
        this.xpDiffPerMinDeltas = xpDiffPerMinDeltas;
        this.lane = lane;
        this.creepsPerMinDeltas = creepsPerMinDeltas;
        this.goldPerMinDeltas = goldPerMinDeltas;
    }
}
