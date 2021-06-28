import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeGameTest {

    private static TicTacToeGame game;

    @BeforeAll
    static void setup() {
        game = new TicTacToeGame();
    }

    @Test
    void return_0_when_sending_an_empty_board() {
        assertEquals(0, game.solveTTT(Arrays.asList("", "", "", "", "", "", "", "", "")));
    }

    @Test
    void return_1_when_sending_a_board_with_spot_0_occupied() {
        assertEquals(1, game.solveTTT(Arrays.asList("O", "", "", "", "", "", "", "", "")));
    }
}