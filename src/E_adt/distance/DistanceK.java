package E_adt.distance;

// A package-private record; clients do not need to know of its existence.
// In this implementation, we store the temperature in kilometers form,
// and the miles() method performs a conversion.
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
