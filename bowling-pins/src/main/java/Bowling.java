import java.util.Arrays;

public class Bowling {
    public String bowlingPins(int[] pinsToRemove) {
        String field = "";
        if (Arrays.stream(pinsToRemove)
            .anyMatch(item -> item == 2)) {
            field += "I I I I\n I I I \n    ";
        } else {
            field += "I I I I\n I I I \n  I ";
        }
        if (Arrays.stream(pinsToRemove)
                .anyMatch(item -> item == 3)) {
            field += "   \n   ";
        } else {
            field += "I  \n   ";
        }
        if (Arrays.stream(pinsToRemove)
                .anyMatch(item -> item == 1)) {
            field += "    ";
        } else {
            field += "I   ";
        }

        return field;
    }
}
