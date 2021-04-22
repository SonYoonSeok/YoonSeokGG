package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParticipantIdentityDto {

    private int participantId;
    private List<PlayerDto> player;

    public ParticipantIdentityDto() {
    }

    public ParticipantIdentityDto(int participantId, List<PlayerDto> player) {
        this.participantId = participantId;
        this.player = player;
    }
}
