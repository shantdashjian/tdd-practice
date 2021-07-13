import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class RockPaperScissorsGameTest {

    private RockPaperScissorsGame game;

    @BeforeEach
    void setup() {
        game = new RockPaperScissorsGame();
    }

    @ParameterizedTest
    @ValueSource(strings = {"paper", "Paper", "PAPER"})
    void return_player_one_wins_when_p1_plays_paper_with_different_char_cases_and_p2_plays_rock(String player1) {
        String player2 = "rock";
        String expectedResult = "Player One Wins!";

        String actualResult = game.play(player1, player2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"paper", "Paper", "PAPER"})
    void return_player_two_wins_when_p1_plays_paper_with_different_char_cases_and_p2_plays_scissors(String player1) {
        String player2 = "scissors";
        String expectedResult = "Player Two Wins!";

        String actualResult = game.play(player1, player2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
}