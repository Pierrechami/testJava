package eval.java;

import eval.game.GameService;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameServiceTest {

    @Test
    public void testPlayRock() {
        GameService game = new GameService();
        assertEquals("You played rock. The computer played scissors. You win!", game.play("rock"));
        assertEquals("Wins: 1, Losses: 0, Ties: 0", game.getScore());
    }

    @Test
    public void testPlayPaper() {
        GameService game = new GameService();
        assertEquals("You played paper. The computer played rock. You win!", game.play("paper"));
        assertEquals("Wins: 1, Losses: 0, Ties: 0", game.getScore());
    }

    @Test
    public void testPlayScissors() {
        GameService game = new GameService();
        assertEquals("You played scissors. The computer played paper. You win!", game.play("scissors"));
        assertEquals("Wins: 1, Losses: 0, Ties: 0", game.getScore());
    }

    @Test
    public void testPlayTie() {
        GameService game = new GameService();
        assertEquals("You played rock. The computer played rock. It's a tie!", game.play("rock"));
        assertEquals("Wins: 0, Losses: 0, Ties: 1", game.getScore());
    }

    @Test
    public void testPlayLose() {
        GameService game = new GameService();
        assertEquals("You played rock. The computer played paper. You lose!", game.play("rock"));
    }
}
