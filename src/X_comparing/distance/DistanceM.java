package X_comparing.distance;

record DistanceM(double miles) implements Distance {
    @Override
    public double kilometers() {
        return miles * MI_KM_CONVERSION_CONSTANT;
    }

    @Override
    public String toString() {
        return "mi = " + miles() + ", km = " + kilometers();
    }
}
