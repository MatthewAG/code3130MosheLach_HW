import I_nodes.Node;

void main() {
    // one way to build a linked list (= a list of linked nodes)
    Node<String> head1 = new Node<>("A", new Node<>("B", new Node<>("C")));

    // an empty list
    Node<String> head2 = null;

    // another way to build a list
    Node<Integer> head3 = new Node<>(1);
    head3.next = new Node<>(2);
    head3.next.next = new Node<>(3);
    head3.next.next.next = new Node<>(4);

    printIteratively(head1); // A B C
    IO.println();
    printIteratively(head2); //
    IO.println();
    printIteratively(head3); // 1 2 3 4
    IO.println();

    IO.println(getSizeIteratively(head1)); // 3
    IO.println(getSizeRecursively(head1)); // 3

    printReversedIteratively(head1); // C B A
    IO.println();
    printReversedRecursively(head1); // C B A
    IO.println();
}

// Given the head of a (possibly empty) linked list, prints the list's elements.
// O(n) time, O(1) space
void printIteratively(Node<?> head) {
    while (head != null) {
        IO.print(head.data + " ");
        head = head.next;
    }
}


// O(n) time, O(n) space
void printRecursively(Node<?> head) {
    if (head != null) {
        IO.print(head.data + " ");
        printRecursively(head.next);
    }
}

// Given the head of a (possibly empty) linked list, returns the number of nodes in the list.
// O(n) time, O(1) space
int getSizeIteratively(Node<?> head) {
    int size = 0;

    while (head != null) {
        size++;
        head = head.next;
    }

    return size;
}

// O(n) time, O(n) space
int getSizeRecursively(Node<?> head) {
    if (head == null) {
        return 0;
    } else {
        return 1 + getSizeRecursively(head.next);
    }
}

// Given the head of a (possibly empty) linked list, prints the list's elements in reverse order.
// O(n) time, O(n) space
<E> void printReversedIteratively(Node<E> head) {
    List<E> aux = new ArrayList<>();

    while (head != null) {
        aux.add(head.data);
        head = head.next;
    }

    for (int i = aux.size() - 1; i >= 0; i--) {
        IO.print(aux.get(i) + " ");
    }
}

// O(n) time, O(n) space
void printReversedRecursively(Node<?> head) {
    if (head != null) {
        printReversedRecursively(head.next);
        IO.print(head.data + " ");
    }
}
