import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
}
