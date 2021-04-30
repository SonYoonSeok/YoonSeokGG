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
    private int item0;
    private int item1;
    private int item2;
    private int item3;
    private int item4;
    private int item5;
}
