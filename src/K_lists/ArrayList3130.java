package K_lists;

import java.util.*;

// most of this was laredy done in earlier homework assignments
public class ArrayList3130<E> implements List3130<E> {
    private E[] elements;
    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 10;

    public ArrayList3130() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayList3130(int initialCapacity) {
        elements = (E[]) new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        return elements[index];
    }

    @Override
    public E set(int index, E element) {
        Objects.checkIndex(index, size);
        E old = elements[index];
        elements[index] = element;
        return old;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], o)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (Objects.equals(elements[i], o)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void sort(Comparator<? super E> comparator) {
        Arrays.sort(elements, 0, size, comparator); // cheating
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayList3130Iterator();
    }

    private class ArrayList3130Iterator implements Iterator<E> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            return elements[index++];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);

            if (i < size - 1) {
                sb.append(", ");
            }
        }

        return sb.append("]").toString();
    }
}
