import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RockPaperScissorsGameTest {

    private RockPaperScissorsGame game;

    @BeforeEach
    void setup() {
        game = new RockPaperScissorsGame();
    }

    @ParameterizedTest
    @CsvSource({"paper, rock", "Paper, ROCK", "PAPER, ROCK"})
    void return_player_one_wins_when_p1_plays_paper_and_p2_plays_rock__with_different_char_cases(String player1, String player2) {
        String expectedResult = "Player One Wins!";

        String actualResult = game.play(player1, player2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({"paper, scissors", "Paper, Scissors", "PAPER, SCISSORS"})
    void return_player_two_wins_when_p1_plays_paper_and_p2_plays_scissors_with_different_char_cases(String player1, String player2) {
        String expectedResult = "Player Two Wins!";

        String actualResult = game.play(player1, player2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({"rock, Paper", "Rock, paper", "ROCK, PAPER"})
    void return_player_two_wins_when_p1_plays_rock_and_p2_plays_paper_with_different_char_cases(String player1, String player2) {
        String expectedResult = "Player Two Wins!";

        String actualResult = game.play(player1, player2);

        assertThat(actualResult).isEqualTo(expectedResult);
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