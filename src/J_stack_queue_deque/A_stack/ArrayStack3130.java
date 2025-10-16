package J_stack_queue_deque.A_stack;

import java.util.Arrays;

/**
 * An implementation of the stack ADT using a dynamic array. Methods isEmpty
 * and pop run in constant time; method push runs in amortized constant time.
 */
public class ArrayStack3130<E> implements Stack3130<E> {
    // Representation: items are stored in an array at indexes [0, size).
    // The top of the stack is elements[size - 1]; the bottom is elements[0].

    private E[] elements;
    private int size = 0;

    /**
     * Creates an ArrayStack3130 with an initial capacity of 10.
     */
    public ArrayStack3130() {
        this(10);
    }

    /**
     * Creates an ArrayStack3130 with the specified initial capacity.
     */
    @SuppressWarnings("unchecked")
    public ArrayStack3130(int initialCapacity) {
        elements = (E[]) new Object[initialCapacity];
    }

    // O(1)
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Amortized O(1) time complexity: if this method is called n times,
    // O(n) steps will be performed in total; so O(1) per average call.
    @Override
    public void push(E e) {
        if (size == elements.length) {
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

        for (int i = size - 1; i >= 0; i--) {
            sb.append(elements[i]);

            if (i > 0) {
                sb.append(", ");
            }
        }

        return sb.append("]").toString();
    }
}
