import java.util.*;

public class Bowling {
    public String bowlingPins(int[] pinsToRemove) {
        List<Integer> list = getIntegers(pinsToRemove);

        String field = "";

        field += list.contains(7) ? "  " : "I ";
        field += list.contains(8) ? "  " : "I ";
        field += list.contains(9) ? "  " : "I ";
        field += list.contains(10) ? " " : "I";
        field += "\n ";

        field += list.contains(4) ? "  " : "I ";
        field += list.contains(5) ? "  " : "I ";
        field += list.contains(6) ? " " : "I";
        field += " \n  ";

        field += list.contains(2) ? "  " : "I ";
        field += list.contains(3) ? " " : "I";
        field += "  \n   ";

        field += list.contains(1) ? " " : "I";
        field += "   ";

        return field;
    }

    private List<Integer> getIntegers(int[] pinsToRemove) {
        List<Integer> list = new ArrayList<>();
        for (int item : pinsToRemove) {
            list.add(item);
        }
        return list;
    }
}
