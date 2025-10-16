package J_stack_queue_deque.A_stack;

/**
 * An unbounded collection of elements to be processed using LIFO order.
 */
public interface Stack3130<E> {
    /**
     * Determines whether the stack is empty.
     */
    boolean isEmpty();

    /**
     * Pushes the specified element onto the top of the stack.
     */
    void push(E e);

    /**
     * Pops the top element off the stack and returns it.
     * Throws an IllegalStateException if the stack is empty.
     */
    E pop();

    /**
     * Returns a String containing the elements listed from top to bottom.
     */
    @Override String toString();
}