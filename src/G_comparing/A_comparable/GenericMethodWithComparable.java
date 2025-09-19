package G_comparing.A_comparable;

import java.util.List;

public class GenericMethodWithComparable {
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
