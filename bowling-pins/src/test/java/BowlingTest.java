import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingTest {

    private static Bowling bowling;

    @BeforeAll
    static void setup() {
        bowling = new Bowling();
    }

    @Test
    void return_field_with_no_pins_removed_when_sending_an_empty_array() {
        int[] pinsToRemove = {};
        assertEquals("I I I I\n I I I \n  I I  \n   I   ", bowling.bowlingPins(pinsToRemove));
    }

    @Test
    void return_field_with_pin_1_removed_when_sending_an_array_of_1() {
        int[] pinsToRemove = {1};
        assertEquals("I I I I\n I I I \n  I I  \n       ", bowling.bowlingPins(pinsToRemove));
    }

}