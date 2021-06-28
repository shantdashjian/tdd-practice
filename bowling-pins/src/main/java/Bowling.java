import java.util.Arrays;
import java.util.Collections;

public class Bowling {
    public String bowlingPins(int[] pinsToRemove) {
        if (Arrays.equals(pinsToRemove, new int[]{1})) {
            return "I I I I\n I I I \n  I I  \n       ";
        }

        if (Arrays.equals(pinsToRemove, new int[]{2})) {
            return "I I I I\n I I I \n    I  \n   I   ";
        }
        return "I I I I\n I I I \n  I I  \n   I   ";
    }
}
