package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MatchlistDto {

    private int startIndex;
    private int totalGames;
    private int endIndex;
    private List<MatchReferenceDto> matches;

    public MatchlistDto() { }

    public MatchlistDto(int startIndex, int totalGames, int endIndex, List<MatchReferenceDto> matches) {
        this.startIndex = startIndex;
        this.totalGames = totalGames;
        this.endIndex = endIndex;
        this.matches = matches;
    }
}
