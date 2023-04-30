import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyArrayListQueue<T> {
    private final MyArrayList<T> queue;

    public MyArrayListQueue() {
        queue = new MyArrayList<>();
    }
    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}



