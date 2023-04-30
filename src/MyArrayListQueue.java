import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyArrayListQueue<T> {
    private final MyArrayList<T> queue;

    /*
     * Constructor for MyArrayListQueue
     * Initializes an empty ArrayList as the queue
     */
    public MyArrayListQueue() {
        queue = new MyArrayList<>();
    }

    /*
     * Adds the specified item to the back of the queue
     * @param item the item to add to the queue
     */
    public void enqueue(T item) {
        queue.add(item);
    }

    /*
     * Removes and returns the item at the front of the queue
     * Throws an exception if the queue is empty
     * @return the item at the front of the queue
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }

    /*
     * Returns the item at the front of the queue without removing it
     * Throws an exception if the queue is empty
     * @return the item at the front of the queue
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    /*
     * Checks if the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /*
     * Returns the number of items in the queue
     * @return the size of the queue
     */
    public int size() {
        return queue.size();
    }

}




