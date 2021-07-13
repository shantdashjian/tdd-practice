import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RockPaperScissorsGameTest {

    private RockPaperScissorsGame game;

    @BeforeEach
    void setup() {
        game = new RockPaperScissorsGame();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "moves.csv", numLinesToSkip = 1)
    void return_result_given_players_one_and_two_play(ArgumentsAccessor data) {
        String actualResult = game.play(data.getString(0), data.getString(1));

        assertThat(actualResult).isEqualTo(data.getString(02));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void throw_exception_when_p1_is_null_or_empty(String player1) {
        String player2 = "paper";

        Exception exception = assertThrows(IllegalArgumentException.class, () -> game.play(player1, player2));
        assertThat(exception.getMessage()).isEqualTo("Both players must have a value!");
    }

    @ParameterizedTest
    @NullAndEmptySource
    void throw_exception_when_p2_is_null_or_empty(String player2) {
        String player1 = "paper";

        Exception exception = assertThrows(IllegalArgumentException.class, () -> game.play(player1, player2));
        assertThat(exception.getMessage()).isEqualTo("Both players must have a value!");
    }
}