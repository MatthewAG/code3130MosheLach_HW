void main() {
    IO.println("demoing HashSet");
    Set<Integer> set1 = new HashSet<>();
    demo(set1);

    IO.println("demoing LinkedHashSet");
    SequencedSet<Integer> set2 = new LinkedHashSet<>();
    demo(set2);
}

private static void demo(Set<Integer> set) {
    set.add(5);
    set.add(19);
    set.add(7);
    IO.println("set = " + set);
    IO.println(set.add(19)); // false
    IO.println("set = " + set);
}