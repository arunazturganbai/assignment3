import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {
    private final MyLinkedList queue;


    public MyLinkedListQueue() {
        queue = new MyLinkedList();
    }

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }


}

