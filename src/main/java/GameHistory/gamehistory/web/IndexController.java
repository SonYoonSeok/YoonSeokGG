package GameHistory.gamehistory.web;

import GameHistory.gamehistory.util.SummonerParser;
import GameHistory.gamehistory.web.dto.SummonerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/summoner/{name}")
    public String summoner(@PathVariable String name, Model model) {
        SummonerDto summonerDto = new SummonerDto();
        SummonerParser summonerParser = new SummonerParser();
        summonerDto = summonerParser.requestSummoner(name);
        System.out.println(summonerDto.toString());

        model.addAttribute("Summoner",summonerDto);
        return "findSummoner";
    }

}
