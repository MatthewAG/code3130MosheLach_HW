import H_iterating.ArraySet;
import H_iterating.MySet;

void main() {
    MySet<String> set = new ArraySet<>(10);
    set.add("a");
    set.add("b");
    set.add("c");

    for (String s : set) {
        IO.print(s + " ");
    }
    IO.println();

    Iterator<String> iter = set.iterator();
    IO.println(iter.next()); // a
    IO.println(iter.next()); // b
    IO.println(iter.hasNext()); // true
    IO.println(iter.next()); // c
    IO.println(iter.hasNext()); // false
    IO.println(iter.next()); // throws NoSuchElementException
}