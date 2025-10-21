package J_stack_queue_deque.A_stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * An implementation of the stack ADT using a dynamic array. Methods isEmpty
 * and pop run in constant time; method push runs in amortized constant time.
 */
public class ArrayStack3130<E> implements Stack3130<E> {
    // Representation: the items are stored in an array at indexes [0, size).
    // The top of the stack is elements[size - 1]; the bottom is elements[0].
    // When necessary, we "grow" the array: we create a new, larger array,
    // copy the items from the old array to the new array, and make `elements`
    // refer to the new array.

    private E[] elements;
    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 10;

    /**
     * Creates an empty stack.
     */
    public ArrayStack3130() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    /**
     * Creates an empty stack with the specified initial capacity.
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
            // long way:
            // E[] newArray = (E[]) new Object[2 * elements.length + 1];
            // for (int i = 0; i < elements.length; i++) newArray[i] = elements[i];
            // elements = newArray;

            // equivalent shorter way:
            elements = Arrays.copyOf(elements, 2 * elements.length + 1); // O(n)
        }

        elements[size++] = e;
        // equivalent to:
        // elements[size] = e;
        // size++;
    }

    // O(1)
    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return elements[--size];
        // equivalent to:
        // size--;
        // return elements[size];
        // that is, it is equivalent to:
        // E result = elements[size - 1];
        // size--;
        // return result;
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
