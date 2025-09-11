package E_adt.distance;

public interface Distance {
    double miles();
    double kilometers();

    static Distance ofMiles(double miles) {
        return new DistanceM(miles);

        // or: ....
    }

    static Distance ofKilometers(double kilometers) {
        return null; // TODO
    }
}