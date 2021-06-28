import java.util.*;

public class RockPaperScissorsGame {
    private Map<String, String> map;


    public String play(String player1, String player2) {
        map = new HashMap<>();
        map.put(player1, "Player 1");
        map.put(player2, "Player 2");

        if (its("rock", "scissors")) {
            return playerWhoPlayed("rock") + " won!";
        }

        if (its("paper", "rock")) {
            return playerWhoPlayed("paper") + " won!";
        }

        if (its("scissors", "paper")) {
            return playerWhoPlayed("scissors") + " won!";
        }

        return "Draw!";
    }

    private String playerWhoPlayed(String item) {
        return map.get(item);
    }

    private boolean its(String item1, String item2) {
        return map.keySet().containsAll(new HashSet<>(Arrays.asList(item1, item2)));
    }
}
