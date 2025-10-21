// Demonstrates the java.util.Stack class.
// There's a better version of stack in the JDK; we'll cover it with Deque.
void main() {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(5);
    stack.push(15);
    IO.println(stack.isEmpty()); // false
    IO.println(stack.size()); // 3
    IO.println(stack); // [10, 5, 15]
    // Note that Stack's toString() lists the elements from bottom to top,
    // unlike the usual convention.

    IO.println(stack.peek()); // 15
    IO.println(stack.peek()); // 15

    IO.println(stack.pop()); // 15
    IO.println(stack.peek()); // 5

    IO.println(stack.pop()); // 5
    IO.println(stack.pop()); // 10
    IO.println(stack.isEmpty()); // true
}