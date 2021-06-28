import java.util.*;

public class RockPaperScissorsGame {
    private Map<String, String> map;

    public String play(String player1, String player2) {
        storeDataFor(player1, player2);

        if (its("rock", "scissors")) {
            return theWinnerIsThePlayerWhoPlayed("rock");
        }

        if (its("paper", "rock")) {
            return theWinnerIsThePlayerWhoPlayed("paper");
        }

        if (its("scissors", "paper")) {
            return theWinnerIsThePlayerWhoPlayed("scissors");
        }

        return bothPlayersPlayedTheSameHand();
    }

    private String bothPlayersPlayedTheSameHand() {
        return "Draw!";
    }

    private void storeDataFor(String player1, String player2) {
        map = new HashMap<>();
        map.put(player1, "Player 1");
        map.put(player2, "Player 2");
    }

    private String theWinnerIsThePlayerWhoPlayed(String item) {
        return playerWhoPlayed(item) + " won!";
    }

    private String playerWhoPlayed(String item) {
        return map.get(item);
    }

    private boolean its(String item1, String item2) {
        return map.keySet().containsAll(new HashSet<>(Arrays.asList(item1, item2)));
    }
}
