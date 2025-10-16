import J_stack_queue_deque.A_stack.ArrayStack3130;
import J_stack_queue_deque.A_stack.LinkedStack3130;
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

    IO.println(sum(stack));
    IO.println(stack);

    while (!stack.isEmpty()) {
        IO.print(stack.pop() + " ");
    }
    // 7 3 5 10
}

/*
Puzzle

Write a method that is given a stack of integers
and returns the sum of the stack's elements.

When the method terminates, the stack must
be in the same state that it was originally in.

Do not use any auxiliary collections (arrays,
ArrayLists, etc.) except for a single stack.
 */
int sum(Stack3130<Integer> stack) {
    Stack3130<Integer> auxStack = new LinkedStack3130<>(); // or ArrayStack3130
    int sum = 0;

    while (!stack.isEmpty()) {
        int element = stack.pop();
        auxStack.push(element);
        sum += element;
    }

    while (!auxStack.isEmpty()) {
        stack.push(auxStack.pop());
    }

    return sum;
}