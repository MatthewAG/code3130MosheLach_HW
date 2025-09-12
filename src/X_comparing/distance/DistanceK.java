package X_comparing.distance;

record DistanceK(double kilometers) implements Distance {
    @Override
    public double miles() {
        return kilometers / MI_KM_CONVERSION_CONSTANT;
    }

    @Override
    public String toString() {
        return "mi = " + miles() + ", km = " + kilometers();
    }
}
