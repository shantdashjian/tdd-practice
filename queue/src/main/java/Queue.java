public class Queue {
    private int size;

    public void enqueue(Object item) {
        size++;
    }

    public int getSize() {
        return size;
    }

    public void dequeue() throws Exception {
        throw new Exception("Queue is empty!");
    }
}
