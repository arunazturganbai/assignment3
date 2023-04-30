import java.util.EmptyStackException;

public class MyLinkedListStack<E> {

    private MyLinkedList<E> list;

    public MyLinkedListStack() {
        list = new MyLinkedList<>();
    }

    public void push(E element) {
        list.addFirst(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
