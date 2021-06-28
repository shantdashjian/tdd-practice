import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeGameTest {

    @Test
    void return_0_when_sending_an_empty_board() {
        TicTacToeGame game = new TicTacToeGame();
        assertEquals(0, game.solveTTT(Arrays.asList("", "", "", "", "", "", "", "", "")));
    }
}