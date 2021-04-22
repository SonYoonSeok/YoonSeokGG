package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamBansDto {

    private int championId;
    private int pickTurn;

    public TeamBansDto() {
    }

    public TeamBansDto(int championId, int pickTurn) {
        this.championId = championId;
        this.pickTurn = pickTurn;
    }
}
