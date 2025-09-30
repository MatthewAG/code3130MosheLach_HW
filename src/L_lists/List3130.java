package L_lists;

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

    // listIterator() ?
}
