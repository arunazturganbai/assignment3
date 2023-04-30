import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {
    private final MyLinkedList queue;

    public MyLinkedListQueue() {
        queue = new MyLinkedList();
    }

    //Inserts the specified element at the end of this queue.

    public void enqueue(T item) {
        queue.addLast(item);
    }

    //Retrieves and removes the head of this queue.

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }

    //Retrieves, but does not remove, the head of this queue.

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.getFirst();
    }

    //Returns true if this queue contains no elements.

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //Returns the number of elements in this queue.
    public int size() {
        return queue.size();
    }

}