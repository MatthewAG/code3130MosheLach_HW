import G_comparing.distance.Distance;

void main() throws FileNotFoundException {
    Scanner fileScanner = new Scanner(new File("distances.txt"));
    List<Distance> distances = new ArrayList<>();

    while (fileScanner.hasNext()) {
        String distanceString = fileScanner.next();

        try {
            distances.add(Distance.parse(distanceString));
        } catch (IllegalArgumentException e) {
            IO.println("skipping invalid distance string: " + distanceString);
        }
    }

    Collections.sort(distances);
    // or: distances.sort(Comparator.naturalOrder());

    IO.println("sorted valid distances:");
    for (Distance distance : distances) {
        IO.println(distance);
    }
}