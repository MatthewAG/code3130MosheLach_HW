package C_search_sort;

/*
Idea: pick an element to be the "pivot" and rearrange the other
elements around the pivot: all elements smaller than pivot go to the
left of the pivot, and all elements greater than or equal to the pivot
go to the right of the pivot. Keep doing this recursively for each of the
two subarrays around the pivot. Don't do anything to a subarray of length
0 or 1, since it's already sorted.
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 5, 6, 1, -2, 3, 14, 12};
        quickSort(arr);
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int lowIndex, int highIndex) {
        // implicit base case: highIndex <= lowIndex (subarray is of length 0 or 1)

        if (highIndex > lowIndex) {
            int pivotIndex = partition(arr, lowIndex, highIndex);
            quickSort(arr, lowIndex, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, highIndex);
        }
    }

    // Chooses a pivot element and partitions arr (from lowIndex through highIndex)
    // around the pivot: all elements less than the pivot will be placed to the left
    // of the pivot, and all elements greater than (or equal to) the pivot will be
    // placed to the right of the pivot.
    // The method returns the index of the pivot element.
    public static int partition(int[] arr, int lowIndex, int highIndex) {
        return 0; // TODO
    }

    private static void swap(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
}