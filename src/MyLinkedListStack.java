import java.util.EmptyStackException;

//MyLinkedListStack is a generic class that implements a stack using a linked list.
public class MyLinkedListStack<E> {
    private MyLinkedList list;

    public MyLinkedListStack() {
        list = new MyLinkedList();
    }

    // The push() method adds an element to the top of the stack using the addFirst() method of MyLinkedList
    public void push(E element) {
        list.addFirst(element);
    }

    //The pop() method removes and returns the top element of the stack using the removeFirst() method of MyLinkedList
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }

    //The peek() method returns the top element of the stack without removing it using the getFirst() method of MyLinkedList
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    //The isEmpty() method returns true if the stack is empty or false if it is not using the isEmpty() method of MyLinkedList
    public boolean isEmpty() {
        return list.isEmpty();
    }

    //The size() method returns the number of elements in the stack using the size() method of MyLinkedList
    public int size() {
        return list.size();
    }
}
