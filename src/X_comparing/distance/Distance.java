package X_comparing.distance;

/**
 * A distance in miles or kilometers.
 */
public interface Distance extends Comparable<Distance> {
    /**
     * Constant used for converting between miles and kilometers:
     * <ul>
     *     <li>mi to km: multiply by 1.60934</li>
     *     <li>km to mi: divide by 1.60934</li>
     * </ul>
     */
    double MI_KM_CONVERSION_CONSTANT = 1.60934;

    /**
     * Returns the distance in miles.
     */
    double miles();

    /**
     * Returns the distance in kilometers.
     */
    double kilometers();

    /**
     * Returns a Distance representing the specified number of miles.
     */
    static Distance ofMiles(double miles) {
        return new DistanceM(miles);
        // or: new DistanceK(miles * MI_KM_CONVERSION_CONSTANT);
    }

    /**
     * Returns a Distance representing the specified number of kilometers.
     */
    static Distance ofKilometers(double kilometers) {
        return new DistanceK(kilometers);
        // or: new DistanceM(kilometers / MI_KM_CONVERSION_CONSTANT);
    }

    /**
     * Compares Distances by length.
     * @param other the Distance to compare with this one
     * @return
     * <ul>
     *     <li>a negative int if this distance is less than the other distance</li>
     *     <li>0 if the distances are equal</li>
     *     <li>a positive int if this distance is greater than the other distance</li>
     * </ul>
     */
    @Override
    default int compareTo(Distance other) {
        return Double.compare(this.miles(), other.miles());
        // or: return Double.compare(this.kilometers(), other.kilometers());
    }
}