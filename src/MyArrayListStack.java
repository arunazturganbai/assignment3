import java.util.EmptyStackException;

public class MyArrayListStack<E> {
    private final MyArrayList<E> list;

    // Constructor that initializes an empty ArrayList
    public MyArrayListStack() {
        list = new MyArrayList<>();
    }

    // Method to push an element onto the top of the stack
    public void push(E element) {
        list.add(element);
    }

    // Method to remove and return the top element from the stack
    // Throws an EmptyStackException if the stack is empty
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(size() - 1);
    }

    // Method to return the top element of the stack without removing it
    // Throws an EmptyStackException if the stack is empty
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(size() - 1);
    }

    // Method to check if the stack is empty
    // Returns true if the stack is empty, false otherwise
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Method to return the size of the stack
    // Returns the number of elements in the stack
    public int size() {
        return list.size();
    }

}

