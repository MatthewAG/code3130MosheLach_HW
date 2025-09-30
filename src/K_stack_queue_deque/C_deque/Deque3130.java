package K_stack_queue_deque.C_deque;

import K_stack_queue_deque.A_stack.Stack3130;
import K_stack_queue_deque.B_queue.Queue3130;

public interface Deque3130<E> extends Stack3130<E>, Queue3130<E> {
    void addFirst(E e);
    void addLast(E e);
    E getFirst();
    E getLast();
    E removeFirst();
    E removeLast();

    @Override
    default void push(E e) {
        addFirst(e);
    }

    @Override
    default E pop() {
        return removeFirst();
    }

    @Override
    default void enqueue(E e) {
        addLast(e);
    }

    @Override
    default E dequeue() {
        return removeFirst();
    }
}
