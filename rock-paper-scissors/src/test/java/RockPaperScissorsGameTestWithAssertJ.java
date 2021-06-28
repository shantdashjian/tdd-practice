import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RockPaperScissorsGameTestWithAssertJ {

    private static RockPaperScissorsGame game;

    @BeforeAll
    static void setup() {
        game = new RockPaperScissorsGame();
    }

    @Test
    void return_draw_when_player1_is_the_same_as_player2() {
        assertThat(game.play("rock", "rock")).isEqualTo("Draw!");
        assertThat(game.play("paper", "paper")).isEqualTo("Draw!");
    }


    @Test
    void return_player1_when_player1_is_rock_and_player2_is_scissors() {
        assertThat(game.play("rock", "scissors")).isEqualTo("Player 1 won!");
    }

    @Test
    void return_player2_when_player1_is_scissors_and_player1_is_rock() {
        assertThat(game.play("scissors", "rock")).isEqualTo("Player 2 won!");
    }

    @Test
    void return_player1_when_player1_is_paper_and_player2_is_rock() {
        assertThat(game.play("paper", "rock")).isEqualTo("Player 1 won!");
    }

    @Test
    void return_player2_when_player1_is_rock_and_player2_is_paper() {
        assertThat(game.play("rock", "paper")).isEqualTo("Player 2 won!");
    }

    @Test
    void return_player1_when_player1_is_scissors_and_player2_is_paper() {
        assertThat(game.play("scissors", "paper")).isEqualTo("Player 1 won!");
    }

    @Test
    void return_player2_when_player1_is_paper_and_player2_is_scissors() {
        assertThat(game.play("paper", "scissors")).isEqualTo("Player 2 won!");
    }

    @Test
    void throws_exception_if_either_player_did_not_play() {
        assertThatThrownBy(() -> game.play("", "rock")).isEqualTo(IllegalArgumentException.class);
        assertThatThrownBy(() -> game.play(null, "rock")).isEqualTo(IllegalArgumentException.class);
        assertThatThrownBy(() -> game.play("rock", "")).isEqualTo(IllegalArgumentException.class);
        assertThatThrownBy(() -> game.play("rock", null)).isEqualTo(IllegalArgumentException.class);
    }
}