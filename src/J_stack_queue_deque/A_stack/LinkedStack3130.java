package J_stack_queue_deque.A_stack;

public class LinkedStack3130<E> implements Stack3130<E> {
    // Representation: ...

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head = null;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void push(E e) {
        head = new Node<>(e, head);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        E result = head.data;
        head = head.next;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = head;

        while (current != null) {
            sb.append(current.data);

            if (current.next != null) {
                sb.append(", ");
            }

            current = current.next;
        }

        return sb.append("]").toString();
    }
}
