import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {

    private static Game game;
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

    @BeforeAll
    static void setup() {
        game = new Game();
    }

    @Test
    void can_roll() {
        game.roll(0);
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
}
