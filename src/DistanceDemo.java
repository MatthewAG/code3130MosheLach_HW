import X_comparing.distance.Distance;

void main() throws FileNotFoundException {
    Scanner fileScanner = new Scanner(new File("distances.txt"));
    List<Distance> distances = new ArrayList<>();

    while (fileScanner.hasNext()) {
        distances.add(Distance.parse(fileScanner.next()));
    }

    Collections.sort(distances);
    // or: distances.sort(Comparator.naturalOrder());

    for (Distance distance : distances) {
        IO.println(distance);
    }
}