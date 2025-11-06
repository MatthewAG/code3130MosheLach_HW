package L_hash_tables.A_set.B_our;

import java.util.Iterator;

public class ChainingHashSet3130<E> implements Set3130<E> {
    // Representation: a hash table.
    // We use chaining to resolve collisions: that is, at
    // each index, we have a chain of linked nodes for all
    // the elements that belong at that index.

    /* private */ static class Node<E> {
        E data;
        Node<E> next;

        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E>[] table;
    private int size = 0; // the number of elements the set currently contains
    private final double maxLoadFactor;
    // maxLoadFactor is the highest level that this set's load factor can go.
    // when the current load factor goes above this level, we resize.

    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    private static final double DEFAULT_MAX_LOAD_FACTOR = 0.75;

    public ChainingHashSet3130() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public ChainingHashSet3130(int initialCapacity) {
        this(initialCapacity, DEFAULT_MAX_LOAD_FACTOR);
    }

    @SuppressWarnings("unchecked")
    public ChainingHashSet3130(int initialCapacity, double maxLoadFactor) {
        if (maxLoadFactor <= 0) {
            throw new IllegalArgumentException("max load factor must be positive");
        }

        table = (Node<E>[]) new Node[initialCapacity];
        this.maxLoadFactor = maxLoadFactor;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    // growAndRehash

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
    public String toString() {
        return null;
    }

    // given any object, returns the index at which the object belongs
    private int hash(Object o) {
        return Math.abs(o.hashCode()) % table.length;
    }

    // returns the current load factor
    private double loadFactor() {
        return size / (double) table.length;
    }
}
