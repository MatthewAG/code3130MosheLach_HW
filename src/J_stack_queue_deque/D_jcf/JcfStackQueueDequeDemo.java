void main() {
    // Queue interface: a collection of elements awaiting processing.
    // Elements are removed one at a time from the head of the queue.
    // In a typical queue, the element at the head is the least-recently added one.
    // Thus a typical queue allows one to process elements in FIFO order.
    // Primary methods: isEmpty(), size(), add(e), peek(), remove().
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new LinkedList<>();

    // Deque interface: a Queue that allows access at both ends.
    // Primary methods: isEmpty(), size(), addFirst(e), addLast(e) = add(e),
    // getFirst() = peek(), getLast(), removeFirst() = remove(), removeLast()
    Deque<Integer> deque1 = new ArrayDeque<>();
    Deque<Integer> deque2 = new LinkedList<>();

    // There is no Stack interface in the JCF, but a Deque can also be used as
    // a stack: a collection whose elements can be processed in LIFO order.
    // Primary methods: isEmpty(), push(e) = addFirst(e), peek() = getFirst(),
    // pop() = remove() = removeFirst()
    Deque<Integer> stack1 = new ArrayDeque<>();
    Deque<Integer> stack2 = new LinkedList<>();

    // There is also an old Stack class, but it is disfavored.
    // Primary methods: isEmpty(), push(e), peek(), pop()
    Stack<Integer> stack = new Stack<>();
}