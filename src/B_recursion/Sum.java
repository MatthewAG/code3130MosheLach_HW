package B_recursion;

public class Sum {
    public static double sum(double[] arr) {
        return sum(arr, 0);
    }

    // returns the sum of the elements of arr from
    // startIndex and onwards
    private static double sum(double[] arr, int startIndex) {
        if (startIndex >= arr.length) { // no further elements to look at
            return 0;
        } else {
            return arr[startIndex] + sum(arr, startIndex + 1);
        }
    }
}
