package J_stack_queue_deque.C_deque;

// TODO for homework
public class ArrayDeque3130<E> implements Deque3130<E> {
    // MAIN METHOOD . \n

    public static void main(String[] args)
    {}

    // ADDED ITEMS

    @SuppressWarnings("unchecked")
    public void grow() {
        E[] newArray = (E[]) new Object[2 * elements.length + 1];

        for (int i = 0; i < size(); i++) {
            newArray[i] = elements[(indexOfFirst + i) % elements.length];
        }

        elements = newArray;
        indexOfLast = size() - 1;
        indexOfFirst = 0;
    }

    private E[] elements;
    private int indexOfFirst = -1, indexOfLast = -1;

    private static final int DEFAULT_INITIAL_CAPACITY = 10;

    /**
     * Creates an empty queue.
     */
    public ArrayDeque3130() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    /**
     * Creates an empty queue with the specified initial capacity.
     */
    @SuppressWarnings("unchecked")
    public ArrayDeque3130(int initialCapacity) {
        elements = (E[]) new Object[initialCapacity];
    }

    // Representation: a circular array (aka a ring buffer).

    @Override
    public void addFirst(E e) {
        if (size() == elements.length) {
            grow();
        }

        if (isEmpty()) {
            indexOfFirst = indexOfLast = 0;
        } else {
            /*indexOfLast = (indexOfLast + 1) % elements.length;*/
            // equivalent to:
            // indexOfLast++;
            // if (indexOfLast == elements.length) indexOfLast = 0;
            indexOfFirst--;
            if (indexOfFirst == -1) {    //  if (indexOfFirst == 0) {
                indexOfFirst = elements.length;
                indexOfFirst--;
            }
        }

        elements[indexOfFirst] = e;    //  elements[indexOfFirst] = element;
    }

    @Override
    public void addLast(E e) {
        if (size() == elements.length) {
            grow();
        }

        if (isEmpty()) {
            indexOfFirst = indexOfLast = 0;
        } else {
            indexOfLast = (indexOfLast + 1) % elements.length;
            // equivalent to:
            // indexOfLast++;
            // if (indexOfLast == elements.length) indexOfLast = 0;
        }

        elements[indexOfLast] = e;    //  elements[indexOfLast] = element;
    }

    @Override
    public E getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return elements[indexOfFirst];
    }

    @Override
    public E getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return elements[indexOfLast];
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E result = elements[indexOfFirst];
        elements[indexOfFirst] = null; // optional

        if (indexOfFirst == indexOfLast) { // queue becomes empty after this dequeue
            indexOfFirst = indexOfLast = -1;
        } else {
            indexOfFirst = (indexOfFirst + 1) % elements.length;
            // equivalent to:
            // indexOfFirst++;
            // if (indexOfFirst == elements.length) indexOfFirst = 0;
        }

        return result;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E result = elements[indexOfLast];
        elements[indexOfLast] = null; // optional

        if (indexOfFirst == indexOfLast) { // queue becomes empty after this dequeue
            indexOfFirst = indexOfLast = -1;
        } else {
            /*indexOfFirst = (indexOfFirst + 1) % elements.length;*/
            // equivalent to:
            // indexOfFirst++;
            // if (indexOfFirst == elements.length) indexOfFirst = 0;
            indexOfLast--;
            if (indexOfLast == -1) { //  if (indexOfLast == 0) {
                indexOfLast = elements.length;
                indexOfLast--;
            }
        }

        return result;
    }

    @Override
    public int size() {
        if (indexOfFirst == -1 && indexOfLast == -1) {
            return 0;
        } else if (indexOfFirst <= indexOfLast) {
            return indexOfLast - indexOfFirst + 1;
        } else {
            return (indexOfLast + 1) + (elements.length - indexOfFirst);
        }
    }

    @Override
    public boolean isEmpty() {
        return( (size()) == (0) );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size(); i++) {
            sb.append(elements[(indexOfFirst + i) % elements.length]);

            if (i < size() - 1) {
                sb.append(", ");
            }
        }

        return sb.append("]").toString();
    }
}
/*
package J_stack_queue_deque.C_deque;

// TODO for homework
public class ArrayDeque3130<E> implements Deque3130<E> {
    // Representation: a circular array (aka a ring buffer).

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
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {
        return null;
    }
}

*/