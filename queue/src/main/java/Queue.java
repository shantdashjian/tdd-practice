import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List list;

    public Queue() {
        list = new ArrayList();
    }

    public int getSize() {
        return list.size();
    }

    public void enqueue(Object item) {
        list.add(item);
    }

    public Object dequeue() throws Exception {
        throwExceptionIfQueueIsEmpty();
        return list.remove(0);
    }

    private void throwExceptionIfQueueIsEmpty() throws Exception {
        if (list.size() == 0) {
            throw new Exception("Queue is empty!");
        }
    }

    public Object peek() throws Exception {
        throwExceptionIfQueueIsEmpty();
        return list.get(0);
    }
}
