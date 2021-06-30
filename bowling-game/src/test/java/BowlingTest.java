import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {

    public static final int HIT_ALL_PINS = 10;
    public static final int MISS_ALL_PINS = 0;
    private Game game;
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }
    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }
    private void rollStrike() {
        game.roll(10);
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

    @Test
    void roll_one_spare_followed_by_3_then_ones() {
        rollSpare();
        game.roll(3);
        rollMany(17, 1);
        assertEquals(5 + 5 + 3 + 3 + 17, game.score());
    }

    @Test
    void roll_one_strike() {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16, MISS_ALL_PINS);
        assertEquals(10 + 3 + 4 + 3 + 4, game.score());
    }

    @Test
    void roll_perfect_game() {
        rollMany(12, HIT_ALL_PINS);
        assertEquals(300, game.score());
    }
}
