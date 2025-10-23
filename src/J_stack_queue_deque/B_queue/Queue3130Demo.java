import J_stack_queue_deque.B_queue.LinkedQueue3130;
import J_stack_queue_deque.B_queue.Queue3130;

void main() {


    int[] data = {18, 4, 7, 42, 9, 33, -8, 0, 14, 42, 7, 42, 42, 19};
    Queue3130<Integer> q = new LinkedQueue3130<>(); // or ArrayQueue3130

    for (int n : data) {
        q.enqueue(n);
    }

    removeAllOccurrences(q, 42);
    IO.println("q = " + q);
}

/*
 Write a method that returns the sum of the elements in the given queue.
 When the method terminates, the queue must be in the same state that it was originally in.
 Constraint: Do not use any auxiliary collections (arrays, ArrayLists, etc.).
*/
int sum(Queue3130<Integer> queue) {
    int sum = 0;

    for (int i = 0; i < queue.size(); i++) {
        int curr = queue.dequeue();
        sum += curr;
        queue.enqueue(curr);
    }

    return sum;
}

/*
Write a method that removes all occurrences of the given value in the given queue.
When the method terminates, all other elements should be in the same order that they were before.
Constraint: Do not use any auxiliary collections (arrays, ArrayLists, etc.).
 */
void removeAllOccurrences(Queue3130<Integer> queue, int value) {
    int originalSize = queue.size();

    for (int i = 0; i < originalSize; i++) {
        int element = queue.dequeue();

        if (element != value) {
            queue.enqueue(element);
        }
    }
}