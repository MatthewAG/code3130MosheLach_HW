package E_adt;

import E_adt.distance.Distance;
// Note that we don't need to import DistanceM or DistanceK!

public class DistanceDemo {
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
    }
}