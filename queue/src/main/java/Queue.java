public class Queue {
    private int size;
    private Object itemEnqueued;

    public void enqueue(Object item) {
        itemEnqueued = item;
        size++;
    }

    public int getSize() {
        return size;
    }

    public Object dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is empty!");
        }
        return itemEnqueued;
    }
}
