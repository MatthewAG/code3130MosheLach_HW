package N_bst.A_set;

import java.util.Iterator;

public class TreeSet3130<E> implements NavigableSet3130<E> {
    // Representation: binary search tree.
    // To keep things simpler, it is not a balanced BST, unlike in the JCF.

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public E higher(E e) {
        return null;
    }

    @Override
    public E lower(E e) {
        return null;
    }
}
