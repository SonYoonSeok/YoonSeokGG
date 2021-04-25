package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParticipantIdentityDto {

    private int participantId;
    private PlayerDto player;

    public ParticipantIdentityDto() {
    }

    public ParticipantIdentityDto(int participantId, PlayerDto player) {
        this.participantId = participantId;
        this.player = player;
    }
}
