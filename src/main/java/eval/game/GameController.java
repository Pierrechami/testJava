package eval.game;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/play/{action}")
    public String play(@PathVariable String action) {
        return gameService.play(action);
    }

    @PostMapping("/restart")
    public void restart() {
        gameService.restart();
    }

    @GetMapping("/score")
    public String getScore() {
        return gameService.getScore();
    }


}