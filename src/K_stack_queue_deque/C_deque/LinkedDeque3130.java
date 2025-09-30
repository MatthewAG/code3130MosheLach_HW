package K_stack_queue_deque.C_deque;

public class LinkedDeque3130<E> implements Deque3130<E> {
    // Representation: doubly-linked list with head and tail pointers.

    private static class Node<E> {
        E data;
        Node<E> previous, next;

        Node(E data, Node<E> previous, Node<E> next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }
    }

    private Node<E> head, tail;

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }
}
