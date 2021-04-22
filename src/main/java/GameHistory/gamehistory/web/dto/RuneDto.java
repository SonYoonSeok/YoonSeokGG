package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RuneDto {

    private int runeId;
    private int rank;

    public RuneDto() {
    }

    public RuneDto(int runeId, int rank) {
        this.runeId = runeId;
        this.rank = rank;
    }
}
