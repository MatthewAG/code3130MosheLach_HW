void main() {
    IO.println(sum()); // 0
    IO.println(sum(5, 10));
    IO.println(sum(5, 10, 15));

    int[] a = {6, 7};
    IO.println(sum(a));
}

// printf(String formatString, Object... args)

// a method with a vararg parameter
int sum(int... nums) {
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
    }

    return sum;
}