package E_adt.distance;

class DistanceM implements Distance {
    private final double miles;

    DistanceM(double miles) {
        this.miles = miles;
    }

    @Override
    public double miles() {
        return miles;
    }

    @Override
    public double kilometers() {
        return 0; // TODO
    }
}
