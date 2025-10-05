package J_stack_queue_deque.A_stack;

import java.util.Arrays;

public class ArrayStack3130<E> implements Stack3130<E> {
    // Representation: ...

    private E[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayStack3130(int initialCapacity) {
        elements = (E[]) new Object[initialCapacity];
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // amortized O(1) time complexity: if this method is called n times,
    // O(n) steps will be performed in total; so O(1) per call on average.
    @Override
    public void push(E e) {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, 2 * elements.length + 1); // O(n)
        }

        elements[size++] = e;
    }

    // O(1)
    @Override
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        return elements[--size];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = size -1; i >= 0; i--) {
            sb.append(elements[i]);

            if (i > 0) {
                sb.append(", ");
            }
        }

        return sb.append("]").toString();
    }
}
