package F_generics.B_generic_static_methods;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    static void main() {
        String[] arr = {"a", "b", "c", "d", "e"};
        IO.println(middle(arr));

        Integer[] integers = {1, 2, 3, 4};
        IO.println(middle(integers));

        int[] ints = {1, 2, 3};
        // IO.println(middle(ints)); // doesn't compile

        List<String> stringList = new ArrayList<>(List.of("a", "b", "c", "d", "e"));
        IO.println("original String list: " + stringList);

        swap(stringList, 0, 2);
        IO.println("list after swapping the elements at indexes 0 and 2: "
                           + stringList);

        List<String> strings = List.of("bus", "train", "car", "boat");
        IO.println(max(strings)); // train
    }

    /**
     * Returns the element at the midpoint of arr (if arr.length is odd)
     * or the element right after the midpoint (if arr.length is even).
     */
    // Examples of things we can pass to this method: String[], Integer[]
    // Examples of things we cannot pass to this method: int[], double[]
    public static <E> E middle(E[] arr) {
        return arr[arr.length / 2];
    }

    /**
     * Swaps the element at index1 with the element at index2.
     */
    // Examples of things we can pass to this method: List<Scanner>, ArrayList<String>
    public static <E> void swap(List<E> list,
                                int index1, int index2) {
        E temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    /**
     * Returns the maximum element in the list according to the elements'
     * natural order.
     */
    // Examples of things we can pass to this method: List<Integer>, ArrayList<String>
    // Examples of things we cannot pass to this method: List<Scanner>
    public static <E extends Comparable<E>> E max(List<E> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("empty list");
        }

        E maxSoFar = list.get(0); // or: list.getFirst();

        for (E e : list) {
            if (e.compareTo(maxSoFar) > 0) {
                maxSoFar = e;
            }
        }

        return maxSoFar;
    }
}