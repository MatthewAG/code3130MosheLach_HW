void main() {
    String[] arr = new String[3];
    int size = 0;
    arr = add(arr, "dog", size);
    size++;
    arr = add(arr, "cat", size);
    size++;
    arr = add(arr, "bird", size);
    size++;
    arr = add(arr, "sparrow", size);
    size++;
}

String[] add(String[] arr, String element, int size) {
    if (size >= arr.length) {
        arr = Arrays.copyOf(arr, arr.length * 2); // why not arr.length + 1 ?
    }

    arr[size] = element;
    return arr;
}