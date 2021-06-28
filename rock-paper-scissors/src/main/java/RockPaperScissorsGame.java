public class RockPaperScissorsGame {
    public String play(String player1, String player2) {
        if (player1.equals("rock") && player2.equals("scissors")) {
            return "Player 1 won!";
        } else if (player2.equals("rock") && player1.equals("scissors")) {
            return "Player 2 won!";
        }
        return "Draw!";
    }
}
