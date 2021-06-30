import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {

    private Game game;
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

    @BeforeEach
    void setup() {
        game = new Game();
    }

    @Test
    void roll_gutter_game() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    void roll_all_ones() {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }

    @Disabled
    @Test
    void roll_one_spare_followed_by_3_then_ones() {
        game.roll(5);
        game.roll(5); //spare
        game.roll(3);
        rollMany(17, 1);
        assertEquals(5 + 5 + 3 + 3 + 17, game.score());
    }
}
