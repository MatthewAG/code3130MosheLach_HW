package L_hash_tables.A_set.B_our;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedHashSet3130<E> extends ChainingHashSet3130<E> implements SequencedSet3130<E> {
    private Node<E> head = null;

    @Override
    public boolean add(E e) {
        return super.add(e); // TODO
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedHashSet3130Iterator();
    }

    private class LinkedHashSet3130Iterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            E result = current.data;
            current = current.next;
            return result;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = head;

        while (current != null) {
            sb.append(current.data);

            if (current.next != null) {
                sb.append(", ");
            }

            current = current.next;
        }

        return sb.append("]").toString();
    }
}
