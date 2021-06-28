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
    void return_first_non_winning_move() {
        assertTrue(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
                .contains(game.solveTTT(Arrays.asList("O", "", "", "", "", "", "", "", ""))));
        assertTrue(Arrays.asList(2, 3, 4, 5, 6, 7, 8)
                .contains(game.solveTTT(Arrays.asList("O", "X", "", "", "", "", "", "", ""))));
        assertTrue(Arrays.asList(3, 4, 5, 6, 7, 8)
                .contains(game.solveTTT(Arrays.asList("O", "X", "O", "", "", "", "", "", ""))));
    }

    @Test
    void return_winning_move_for_rows() {
        assertEquals(5, game.solveTTT(Arrays.asList("O", "O", "", "X", "X", "", "O", "X", "O")));
        assertEquals(4, game.solveTTT(Arrays.asList("O", "", "O", "X", "", "X", "O", "X", "O")));
        assertEquals(6, game.solveTTT(Arrays.asList("O", "X", "O", "O", "O", "", "", "X", "X")));
    }

    @Test
    void return_winning_move_for_columns() {
        assertEquals(3, game.solveTTT(Arrays.asList("X", "O", "", "", "O", "", "X", "O", "X")));
        assertEquals(7, game.solveTTT(Arrays.asList("", "X", "", "", "X", "", "O", "", "O")));
        assertEquals(8, game.solveTTT(Arrays.asList("", "", "X", "", "", "X", "O", "O", "")));
    }

    @Test
    void return_winning_move_for_diagonals() {
        assertEquals(8, game.solveTTT(Arrays.asList("X", "", "", "", "X", "", "", "", "")));
        assertEquals(6, game.solveTTT(Arrays.asList("", "", "X", "", "X", "", "", "", "")));
    }

    @Test
    void throw_exception_when_passing_full_board() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> game.solveTTT(Arrays.asList("X", "X",
                "O", "O",
                "X", "X",
                "O", "O", "X")));
        assertEquals("Board is full!!", exception.getMessage());
    }
}