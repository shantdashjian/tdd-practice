import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RockPaperScissorsGame {
    Set<String> set;


    public String play(String player1, String player2) {
        set = new HashSet<>(Arrays.asList(player1, player2));

        if (its("rock", "scissors")) {
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

        if (set.containsAll(new HashSet<>(Arrays.asList("scissors", "paper")))) {
            if (player1.equals("scissors")) {
                return "Player 1 won!";
            } else {
                return "Player 2 won!";
            }
        }
        return "Draw!";
    }

    private boolean its(String item1, String item2) {
        return set.containsAll(new HashSet<>(Arrays.asList(item1, item2)));
    }
}
