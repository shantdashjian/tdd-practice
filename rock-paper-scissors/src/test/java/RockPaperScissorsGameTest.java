import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsGameTest {

    @Test
    void return_draw_when_player1_is_the_same_as_player2() {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        assertEquals("Draw!", game.play("rock", "rock"));
        assertEquals("Draw!", game.play("paper", "paper"));
    }

}