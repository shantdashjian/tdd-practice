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

    @Test
    void return_field_with_pin_2_removed_when_sending_an_array_of_2() {
        int[] pinsToRemove = {2};
        assertEquals("I I I I\n I I I \n    I  \n   I   ", bowling.bowlingPins(pinsToRemove));
    }

    @Test
    void return_field_with_pin_1_and_2_removed_when_sending_an_array_of_1_and_2() {
        int[] pinsToRemove = {1, 2};
        assertEquals("I I I I\n I I I \n    I  \n       ", bowling.bowlingPins(pinsToRemove));
    }

    @Test
    void return_field_with_pin_3_removed_when_sending_an_array_of_3() {
        int[] pinsToRemove = {3};
        assertEquals("I I I I\n I I I \n  I    \n   I   ", bowling.bowlingPins(pinsToRemove));
    }

    @Test
    void return_field_with_pin_4_removed_when_sending_an_array_of_4() {
        int[] pinsToRemove = {4};
        assertEquals("I I I I\n   I I \n  I I  \n   I   ", bowling.bowlingPins(pinsToRemove));
    }

    @Test
    void return_field_with_pin_5_removed_when_sending_an_array_of_5() {
        int[] pinsToRemove = {5};
        assertEquals("I I I I\n I   I \n  I I  \n   I   ", bowling.bowlingPins(pinsToRemove));
    }

    @Test
    void return_field_with_pin_6_removed_when_sending_an_array_of_6() {
        int[] pinsToRemove = {6};
        assertEquals("I I I I\n I I   \n  I I  \n   I   ", bowling.bowlingPins(pinsToRemove));
    }

    @Test
    void return_field_with_pin_7_removed_when_sending_an_array_of_7() {
        int[] pinsToRemove = {7};
        assertEquals("  I I I\n I I I \n  I I  \n   I   ", bowling.bowlingPins(pinsToRemove));
    }

    @Test
    void return_field_with_pin_8_removed_when_sending_an_array_of_8() {
        int[] pinsToRemove = {8};
        assertEquals("I   I I\n I I I \n  I I  \n   I   ", bowling.bowlingPins(pinsToRemove));
    }

    @Test
    void return_field_with_pin_9_removed_when_sending_an_array_of_9() {
        int[] pinsToRemove = {9};
        assertEquals("I I   I\n I I I \n  I I  \n   I   ", bowling.bowlingPins(pinsToRemove));
    }

    @Test
    void return_field_with_pin_10_removed_when_sending_an_array_of_10() {
        int[] pinsToRemove = {10};
        assertEquals("I I I  \n I I I \n  I I  \n   I   ", bowling.bowlingPins(pinsToRemove));
    }

    @Test
    void return_empty_field_with_all_pins_removed_when_sending_an_array_of_all_pins() {
        int[] pinsToRemove = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals("       \n       \n       \n       ", bowling.bowlingPins(pinsToRemove));
    }

}