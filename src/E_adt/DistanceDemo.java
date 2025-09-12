import E_adt.distance.Distance;
// Note that we don't need to import DistanceM or DistanceK!

void main() {
    Distance d1 = Distance.ofMiles(10);
    IO.println(d1.miles());      // 10.0
    IO.println(d1.kilometers()); // 16.094
    IO.println(d1);
    IO.println();

    Distance d2 = Distance.ofKilometers(10);
    IO.println(d2.miles());      // 6.213727366498068
    IO.println(d2.kilometers()); // 10.0
    IO.println(d2);
    IO.println();

    Distance d3 = Distance.parse("1.5mi");
    IO.println(d3);
    IO.println();

    Distance d4 = Distance.parse("1.5km");
    IO.println(d4);
    IO.println();
}