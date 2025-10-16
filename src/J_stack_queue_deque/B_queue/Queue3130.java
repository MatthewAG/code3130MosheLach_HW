package J_stack_queue_deque.B_queue;

/**
 * An unbounded collection of elements to be processed using FIFO order.
 */
public interface Queue3130<E> {
    boolean isEmpty();
    void enqueue(E e);
    E dequeue(); // throws
    @Override String toString();
}
