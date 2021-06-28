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
    void return_index_between_1_and_8_when_sending_a_board_with_spot_0_occupied() {
        int result = game.solveTTT(Arrays.asList("O", "", "", "", "", "", "", "", ""));
        assertTrue(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).contains(result));
    }

    @Test
    void return_index_between_2_and_8_when_sending_a_board_with_spot_0_and_1_occupied() {
        int result = game.solveTTT(Arrays.asList("O", "X", "", "", "", "", "", "", ""));
        assertTrue(Arrays.asList(2, 3, 4, 5, 6, 7, 8).contains(result));
    }

    @Test
    void return_index_between_3_and_8_when_sending_a_board_with_spot_0_1_and_2_occupied() {
        int result = game.solveTTT(Arrays.asList("O", "X", "O", "", "", "", "", "", ""));
        assertTrue(Arrays.asList(3, 4, 5, 6, 7, 8).contains(result));
    }

    @Test
    void return_a_winning_index_at_2_when_sending_a_board_with_spots_0_and_1_with_X_and_2_is_empty() {
        assertEquals(2, game.solveTTT(Arrays.asList("X", "X", "", "O", "O", "X", "O", "X", "O")));
    }

    @Test
    void return_a_winning_index_at_5_when_sending_a_board_with_spots_0_and_1_with_O_and_3_and_4_with_X_and_2_and_5_are_empty() {
        assertEquals(5, game.solveTTT(Arrays.asList("O", "O", "", "X", "X", "", "O", "X", "O")));
    }

    @Test
    void return_a_winning_index_at_4_when_sending_a_board_with_spots_0_and_2_with_O_and_3_and_5_with_X_and_1_and_4_are_empty() {
        assertEquals(4, game.solveTTT(Arrays.asList("O", "", "O", "X", "", "X", "O", "X", "O")));
    }

    @Test
    void return_a_winning_index_at_6_when_sending_a_board_with_spots_6_empty_and_spots_7_and_8_with_X() {
        assertEquals(6, game.solveTTT(Arrays.asList("O", "X", "O", "O", "O", "", "", "X", "X")));
    }

    @Test
    void return_a_winning_index_at_3_when_sending_a_board_with_spot_3_empty_and_0_and_6_X() {
        assertEquals(3, game.solveTTT(Arrays.asList("X", "O", "", "", "O", "", "X", "O", "X")));
    }

    @Test
    void return_a_winning_index_at_7_when_sending_a_board_with_spot_7_empty_and_1_and_4_X() {
        assertEquals(7, game.solveTTT(Arrays.asList("", "X", "", "", "X", "", "O", "", "O")));
    }

    @Test
    void return_true_when_asking_if_there_is_a_winning_move_for_X_X_empty() {
        assertTrue(game.thereIsAWinningMoveIn("X", "X", ""));
    }

    @Test
    void return_true_when_asking_if_there_is_a_winning_move_for_X_empty_X() {
        assertTrue(game.thereIsAWinningMoveIn("X", "", "X"));
    }

    @Test
    void return_true_when_asking_if_there_is_a_winning_move_for_empty_X_X() {
        assertTrue(game.thereIsAWinningMoveIn("", "X", "X"));
    }
}