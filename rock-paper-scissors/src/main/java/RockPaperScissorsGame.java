import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RockPaperScissorsGame {
    public String play(String player1, String player2) {
        Set<String> set = new HashSet<>(Arrays.asList(player1, player2));

        if (set.containsAll(new HashSet<>(Arrays.asList("rock", "scissors")))) {
            if (player1.equals("rock")) {
                return "Player 1 won!";
            } else {
                return "Player 2 won!";
            }
        }

        if (set.containsAll(new HashSet<>(Arrays.asList("paper", "rock")))) {
            if (player1.equals("paper")) {
                return "Player 1 won!";
            } else {
                return "Player 2 won!";
            }
        }
        return "Draw!";
    }
}
