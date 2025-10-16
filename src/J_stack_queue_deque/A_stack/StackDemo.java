import J_stack_queue_deque.A_stack.ArrayStack3130;
import J_stack_queue_deque.A_stack.Stack3130;

void main() {
    Stack3130<Integer> stack = new ArrayStack3130<>();
    // or: Stack3130<Integer> stack = new LinkedStack3130<>();
    stack.push(10);
    stack.push(5);
    stack.push(15);
    stack.push(12);
    IO.println(stack); // [12, 15, 5, 10]

    IO.println(stack.pop()); // 12
    IO.println(stack.pop()); // 15
    IO.println(stack); // [5, 10]

    stack.push(3);
    stack.push(7);
    IO.println(stack); // [7, 3, 5, 10]

    while (!stack.isEmpty()) {
        IO.print(stack.pop() + " ");
    }
    // 7 3 5 10
}