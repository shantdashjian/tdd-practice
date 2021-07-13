import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class RockPaperScissorsGameTest {

    @ParameterizedTest
    @ValueSource(strings = {"paper", "Paper", "PAPER"})
    void return_player_one_wins_when_p1_plays_paper_with_different_char_cases_and_p2_plays_rock(String player1) {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String player2 = "rock";
        String expectedResult = "Player One Wins!";

        String actualResult = game.play(player1, player2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
}