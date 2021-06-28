public class RockPaperScissorsGame {
    public String play(String player1, String player2) {
        if (player1.equals("rock") && player2.equals("scissors")) {
            return "Player 1 won!";
        }
        return "Draw!";
    }
}
