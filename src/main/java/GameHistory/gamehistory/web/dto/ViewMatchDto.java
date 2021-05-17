package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class ViewMatchDto {

    private int championId;
    private String championName;
    private String r_name;
    private int kills;
    private int deaths;
    private int assists;
    private double kda;
    private boolean win;
    private String r_win;
    private int item0;
    private int item1;
    private int item2;
    private int item3;
    private int item4;
    private int item5;
    private int level;
    private double damageAmount;
}
