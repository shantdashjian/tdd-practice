import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {

    private static Game game;

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
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

    @Test
    void roll_all_ones() {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }
}
