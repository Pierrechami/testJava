package eval.game;

import java.util.Random;

public class GameService {
    private int wins;
    private int losses;
    private int ties;

    public GameService() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    public String play(String action) {
        String[] options = {"rock", "paper", "scissors"};
        Random rand = new Random();
        String computerAction = options[rand.nextInt(options.length)];
        String result = getResult(action, computerAction);
        updateScore(result);
        return "You played " + action + ". The computer played " + computerAction + ". " + result + ".";
    }

    public void restart() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    public String getScore() {
        return "Wins: " + wins + ", Losses: " + losses + ", Ties: " + ties;
    }

    public void updateScore(String result) {
        switch (result) {
            case "win" -> this.wins++;
            case "lose" -> this.losses++;
            case "tie" -> this.ties++;
        }
    }

    public String getResult(String action, String computerAction) {
        if (action.equals(computerAction)) {
            return "It's a tie!";
        } else if (action.equals("rock") && computerAction.equals("scissors") ||
                action.equals("paper") && computerAction.equals("rock") ||
                action.equals("scissors") && computerAction.equals("paper")) {
            return "You win!";
        } else {
            return "You lose!";
        }
    }

}
