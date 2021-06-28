import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TicTacToeGameTestWithAssertJ {

    private static TicTacToeGame game;

    @BeforeAll
    static void setup() {
        game = new TicTacToeGame();
    }

    @Test
    void return_index_between_0_and_8_when_sending_an_empty_board() {
        int result = game.solveTTT(Arrays.asList("", "", "", "", "", "", "", "", ""));
        assertThat(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8)).contains(result);
    }

    @Test
    void return_first_non_winning_move() {
        assertThat(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8))
                .contains(game.solveTTT(Arrays.asList("O", "", "", "", "", "", "", "", "")));
        assertThat(Arrays.asList(2, 3, 4, 5, 6, 7, 8))
                .contains(game.solveTTT(Arrays.asList("O", "X", "", "", "", "", "", "", "")));
        assertThat(Arrays.asList(3, 4, 5, 6, 7, 8))
                .contains(game.solveTTT(Arrays.asList("O", "X", "O", "", "", "", "", "", "")));
    }

    @Test
    void return_winning_move_for_rows() {
        assertThat(game.solveTTT(Arrays.asList("O", "O", "", "X", "X", "", "O", "X", "O"))).isEqualTo(5);
        assertThat(game.solveTTT(Arrays.asList("O", "", "O", "X", "", "X", "O", "X", "O"))).isEqualTo(4);
        assertThat(game.solveTTT(Arrays.asList("O", "X", "O", "O", "O", "", "", "X", "X"))).isEqualTo(6);
    }

    @Test
    void return_winning_move_for_columns() {
        assertThat(game.solveTTT(Arrays.asList("X", "O", "", "", "O", "", "X", "O", "X"))).isEqualTo(3);
        assertThat(game.solveTTT(Arrays.asList("", "X", "", "", "X", "", "O", "", "O"))).isEqualTo(7);
        assertThat(game.solveTTT(Arrays.asList("", "", "X", "", "", "X", "O", "O", ""))).isEqualTo(8);
    }

    @Test
    void return_winning_move_for_diagonals() {
        assertThat(game.solveTTT(Arrays.asList("X", "", "", "", "X", "", "", "", ""))).isEqualTo(8);
        assertThat(game.solveTTT(Arrays.asList("", "", "X", "", "X", "", "", "", ""))).isEqualTo(6);
    }

    @Test
    void throw_exception_when_passing_full_board() {
        assertThatThrownBy(() -> game.solveTTT(Arrays.asList("X", "X",
                "O", "O",
                "X", "X",
                "O", "O", "X")))
                .hasMessage("Board is full!!");
    }
}