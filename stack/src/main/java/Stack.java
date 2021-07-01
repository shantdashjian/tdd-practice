import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List list;

    public Stack() {
        list = new ArrayList();
    }

    public void push(Object item) {
        list.add(item);
    }

    public int getSize() {
        return list.size();
    }

    public Object pop() throws Exception{
        throwExceptionIfStackIsEmpty();
        return list.remove(list.size() - 1);
    }

    public Object peek() throws Exception {
        throwExceptionIfStackIsEmpty();
        return list.get(list.size() - 1);
    }

    private void throwExceptionIfStackIsEmpty() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Stack is empty!");
        }
    }
}
