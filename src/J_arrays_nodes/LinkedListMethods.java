import J_arrays_nodes.Node;

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
    printIteratively(head2); //
    printIteratively(head3); // 1 2 3 4

    printReversedRecursively(head1); // C B A

    Node<Integer> head4 = null;
    for (int i = 5; i <= 25; i += 5) {
        head4 = addLastIteratively(head4, i);
    }
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
    Node<?> current = head;
    int size = 0;

    while (current != null) {
        size++;
        current = current.next;
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
    Node<E> current = head;

    while (current != null) {
        aux.add(current.data);
        current = current.next;
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

// Given the head of a (possibly empty) linked list and an element, adds the element
// at the front of the list, and returns the head of the updated list.
// O(1) time, O(1) space
<E> Node<E> addFirst(Node<E> head, E element) {
    return new Node<>(element, head);
}

// Given the head of a (possibly empty) linked list and an element, adds the element
// at the end of the list, and returns the head of the updated list.
// O(n) time, O(1) space
<E> Node<E> addLastIteratively(Node<E> head, E element) {
    if (head == null) {
        return new Node<>(element);
    }

    Node<E> curr = head;

    while (curr.next != null) {
        curr = curr.next;
    }

    curr.next = new Node<>(element);
    return head;
}

// O(n) time, O(n) space
<E> Node<E> addLastRecursively(Node<E> head, E element) {
    if (head == null) {
        return new Node<>(element);
    } else {
        head.next = addLastRecursively(head.next, element);
        return head;
    }
}