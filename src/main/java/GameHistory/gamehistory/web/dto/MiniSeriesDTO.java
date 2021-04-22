package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MiniSeriesDTO {

    private int losses;
    private String progress;
    private int target;
    private int wins;

    public MiniSeriesDTO() {
    }

    public MiniSeriesDTO(int losses, String progress, int target, int wins) {
        this.losses = losses;
        this.progress = progress;
        this.target = target;
        this.wins = wins;
    }
}
