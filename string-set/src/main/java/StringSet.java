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

    public String remove(String string) throws InvalidOperationException {
        if (!list.contains(string)) {
            throw new InvalidOperationException("String does not exist in set!");
        }
        list.remove(string);
        return string;
    }

    public StringSet union(StringSet other) {
        StringSet unionSet = new StringSet();
        this.list.forEach(item -> unionSet.add(item));
        other.list.forEach(item -> unionSet.add(item));
        return unionSet;
    }

    public StringSet intersect(StringSet other) {
        StringSet intersectionSet = new StringSet();
        this.list.forEach(item -> {
            if (other.contains(item)) {
                intersectionSet.add(item);
            }
        });
        return intersectionSet;
    }
}
