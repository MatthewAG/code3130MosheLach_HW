package K_lists;

import J_stack_queue_deque.C_deque.Deque3130;

import java.util.Comparator;
import java.util.Iterator;

// TODO for homework
// Required representation: chain of doubly-linked nodes.
// There should be a head pointer, a tail pointer, and an int size.
// Required method running times:
// - isEmpty, size, addFirst, addLast, getFirst, getLast, removeFirst, removeLast: O(1)
// - add, remove, get, set: O(n), but at most n/2 "hops" (i.e. going from node to node.next,
//   or from node to node.previous)
// - indexOf, lastIndexOf, toString: O(n)
// - sort: O(n log n) [use as much memory as you want]
// - iterator: O(1).
// The methods next() and hasNext() of Iterator returned by iterator() should run in O(1) time.
// The Iterator does not need to have a remove() method.
public class LinkedList3130<E> implements Deque3130<E>, List3130<E> {
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    // deque methods

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

    // list methods

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort(Comparator<? super E> comparator) {
        // copy the elements into an array, sort the array,
        // and then copy the sorted elements back into the list
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
