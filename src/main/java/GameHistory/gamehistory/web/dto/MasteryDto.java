package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MasteryDto {

    private int rank;
    private int masteryId;

    public MasteryDto() {
    }

    public MasteryDto(int rank, int masteryId) {
        this.rank = rank;
        this.masteryId = masteryId;
    }
}
