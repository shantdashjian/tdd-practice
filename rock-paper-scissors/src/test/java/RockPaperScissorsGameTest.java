import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RockPaperScissorsGameTest {

    @Test
    void return_player_one_wins_when_p1_plays_paper_and_p2_plays_rock() {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String player1 = "paper";
        String player2 = "rock";
        String expectedResult = "Player One Wins!";

        String actualResult = game.play(player1, player2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
}