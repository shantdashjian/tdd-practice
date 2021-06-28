import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsGameTest {

    @Test
    void return_draw_when_player1_is_the_same_as_player2() {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        assertEquals("Draw!", game.play("rock", "rock"));
        assertEquals("Draw!", game.play("paper", "paper"));
    }


    @Test
    void return_player1_when_player1_is_rock_and_player2_is_scissors() {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        assertEquals("Player 1 won!", game.play("rock", "scissors"));
    }
}