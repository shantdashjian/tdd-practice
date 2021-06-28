import java.util.*;

public class Bowling {
    public String bowlingPins(int[] pinsToRemove) {
        List<Integer> list = new ArrayList<>();
        for (int item : pinsToRemove) {
            list.add(item);
        }

        String field = "";

        if (list.contains(7)) {
            field += "  ";
        } else {
            field += "I ";
        }

        if (list.contains(8)) {
            field += "  ";
        } else {
            field += "I ";
        }

        if (list.contains(9)) {
            field += "  ";
        } else {
            field += "I ";
        }

        if (list.contains(10)) {
            field += " \n ";
        } else {
            field += "I\n ";
        }

        if (list.contains(4)) {
            field += "  ";
        } else {
            field += "I ";
        }

        if (list.contains(5)) {
            field += "  ";
        } else {
            field += "I ";
        }

        if (list.contains(6)) {
            field += "  \n  ";
        } else {
            field += "I \n  ";
        }

        if (list.contains(2)) {
            field += "  ";
        } else {
            field += "I ";
        }
        if (list.contains(3)) {
            field += "   \n   ";
        } else {
            field += "I  \n   ";
        }
        if (list.contains(1)) {
            field += "    ";
        } else {
            field += "I   ";
        }

        return field;
    }
}
