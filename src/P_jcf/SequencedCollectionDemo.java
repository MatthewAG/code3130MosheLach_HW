void main() {

}

void printFirstAndLast(SequencedCollection<?> sequencedCollection) {
    IO.println(sequencedCollection.getFirst());
    IO.println(sequencedCollection.getLast());
}

void printEveryOtherElement(SequencedCollection<?> sequencedCollection) {
    for (Iterator<?> it = sequencedCollection.iterator(); it.hasNext(); ) {
        IO.println(it.next());

        if (it.hasNext()) {
            it.next(); // obtain the next element, thus advancing the iterator
        }
    }
}