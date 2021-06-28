import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingTest {

    @Test
    void return_field_with_no_pins_removed() {
        Bowling bowling = new Bowling();
        int[] pinsToRemove = {};
        assertEquals("I I I I\n I I I \n  I I  \n   I   ", bowling.bowlingPins(pinsToRemove));
    }

}