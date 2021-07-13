public class RockPaperScissorsGame {
    public String play(String player1, String player2) {
        if ((player1.toLowerCase().equals("paper") && player2.equals("scissors"))
                || (player1.toLowerCase().equals("rock") && player2.equals("paper"))) {
            return "Player Two Wins!";
        }
        return "Player One Wins!";
    }
}
