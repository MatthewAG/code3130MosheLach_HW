// This program demonstrates how to remove elements from a partially-filled array
// while preserving the order of the elements.
void main() {
    String[] arr = new String[10];
    arr[0] = "dog";
    arr[1] = "cat";
    arr[2] = "sparrow";
    arr[3] = "duck";
    int size = 4; // we only care about the elements from index 0 through index (size - 1)

    remove(arr, 1, size);
    size--;
    IO.println(toString(arr, size));
    IO.println(Arrays.toString(arr));
    // note that there's an extra "duck" in the array, but we don't care,
    // since we only consider the elements until index size.
}

String toString(String[] arr, int size) {
    StringBuilder result = new StringBuilder("[");

    for (int i = 0; i < size; i++) {
        result.append(arr[i]).append(" ");
    }

    return result.append("]").toString();
}

void remove(String[] arr, int index, int size) {
    for (int i = index; i < size - 1; i++) {
        arr[i] = arr[i + 1];
    }
}