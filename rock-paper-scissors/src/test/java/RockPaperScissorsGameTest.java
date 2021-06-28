import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsGameTest {

    private static RockPaperScissorsGame game;

    @BeforeAll
    static void setup() {
        game = new RockPaperScissorsGame();
    }

    @Test
    void return_draw_when_player1_is_the_same_as_player2() {
        assertEquals("Draw!", game.play("rock", "rock"));
        assertEquals("Draw!", game.play("paper", "paper"));
    }


    @Test
    void return_player1_when_player1_is_rock_and_player2_is_scissors() {
        assertEquals("Player 1 won!", game.play("rock", "scissors"));
    }

    @Test
    void return_player2_when_player1_is_scissors_and_player1_is_rock() {
        assertEquals("Player 2 won!", game.play("scissors", "rock"));
    }

    @Test
    void return_player1_when_player1_is_paper_and_player2_is_rock() {
        assertEquals("Player 1 won!", game.play("paper", "rock"));
    }

    @Test
    void return_player2_when_player1_is_rock_and_player2_is_paper() {
        assertEquals("Player 2 won!", game.play("rock", "paper"));
    }

    @Test
    void return_player1_when_player1_is_scissors_and_player2_is_paper() {
        assertEquals("Player 1 won!", game.play("scissors", "paper"));
    }

    @Test
    void return_player2_when_player1_is_paper_and_player2_is_scissors() {
        assertEquals("Player 2 won!", game.play("paper", "scissors"));
    }

    @Test
    void throws_exception_if_either_player_did_not_play() {
        assertThrows(IllegalArgumentException.class, () -> game.play("", "rock"));
        assertThrows(IllegalArgumentException.class, () -> game.play(null, "rock"));
        assertThrows(IllegalArgumentException.class, () -> game.play("rock", ""));
        assertThrows(IllegalArgumentException.class, () -> game.play("rock", null));
    }
}