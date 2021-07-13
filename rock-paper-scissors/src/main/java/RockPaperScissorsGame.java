public class RockPaperScissorsGame {
    public String play(String player1, String player2) {
        if ((player1 == null || player1.isEmpty())
                || (player2 == null || player2.isEmpty())) {
            throw new IllegalArgumentException("Both players must have a value!");
        }

        if ((player1.toLowerCase().equals("paper") && player2.toLowerCase().equals("scissors"))
                || (player1.toLowerCase().equals("rock") && player2.toLowerCase().equals("paper"))) {
            return "Player Two Wins!";
        }

        if (player1.toLowerCase().equals(player2.toLowerCase())) {
            return "Draw!";
        }

        return "Player One Wins!";
    }
}
