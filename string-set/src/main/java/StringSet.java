import java.util.ArrayList;
import java.util.List;

public class StringSet {
    private List<String> list;

    public StringSet() {
        list = new ArrayList<>();
    }

    public int getCount() {
        return list.size();
    }

    public void add(String string) {
        if (!list.contains(string)) {
            list.add(string);
        }
    }

    public boolean contains(String string) {
        return list.contains(string);
    }

    public void remove(String string) throws InvalidOperationException {
        if (!list.contains(string)) {
            throw new InvalidOperationException("String does not exist in set!");
        }
    }
}
