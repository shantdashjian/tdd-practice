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
    void return_index_between_0_and_8_when_sending_an_empty_board() {
        int result = game.solveTTT(Arrays.asList("", "", "", "", "", "", "", "", ""));
        assertTrue(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8).contains(result));
    }

    @Test
    void return_1_when_sending_a_board_with_spot_0_occupied() {
        assertEquals(1, game.solveTTT(Arrays.asList("O", "", "", "", "", "", "", "", "")));
    }

    @Test
    void return_2_when_sending_a_board_with_spot_0_and_1_occupied() {
        assertEquals(2, game.solveTTT(Arrays.asList("O", "X", "", "", "", "", "", "", "")));
    }

    @Test
    void return_3_when_sending_a_board_with_spot_0_1_and_2_occupied() {
        assertEquals(3, game.solveTTT(Arrays.asList("O", "X", "O", "", "", "", "", "", "")));
    }
}