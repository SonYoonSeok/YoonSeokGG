package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ViewMatchDto {

    private int championId;
    private int kills;
    private int deaths;
    private int assists;
    private boolean win;
}
