import org.junit.jupiter.api.Test;

public class BowlingTest {
    @Test
    void can_create_Game() {
        Game g = new Game();
    }

    @Test
    void can_roll() {
        Game g = new Game();
        g.roll(0);
    }
}
