import java.util.ArrayList;
import java.util.List;

public class StringSet {
    private int count;
    private List<String> list;

    public StringSet() {
        list = new ArrayList<>();
    }

    public int getCount() {
        return count;
    }

    public void add(String string) {
        list.add(string);
        count++;
    }

    public boolean contains(String string) {
        return list.contains(string);
    }
}
