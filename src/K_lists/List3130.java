package K_lists;

import java.util.Comparator;

public interface List3130<E> extends Iterable<E> {
    int size();
    void add(int index, E element);
    E remove(int index);
    E get(int index);
    E set(int index, E element);
    int indexOf(Object o);
    int lastIndexOf(Object o);
    void sort(Comparator<? super E> comparator);
    @Override String toString();

    // no time to cover:
    // List3130<E> reversed()?
    // ListIterator<E> listIterator()?
    // List3130<E> subList(int fromIndex, int toIndex)?
}
