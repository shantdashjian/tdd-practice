public class RockPaperScissorsGame {
    public String play(String player1, String player2) {
        if ((player1 == null || player1.isEmpty())
                || (player2 == null || player2.isEmpty())) {
            throw new IllegalArgumentException("Both players must have a value!");
        }

        if ((player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("scissors"))
                || (player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("paper"))
                || (player1.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("rock"))) {
            return "Player Two Wins!";
        }

        if (player1.equalsIgnoreCase(player2)) {
            return "Draw!";
        }

        return "Player One Wins!";
    }
}
