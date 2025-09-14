package E_adt.distance;

/**
 * A distance in miles or kilometers.
 */
public interface Distance {
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
     * Returns a Distance parsed from the provided distance string.
     * @param distanceString a String consisting of a number followed by "mi" or "km" and no spaces
     * @throws IllegalArgumentException if the distance string is invalid
     */
    static Distance parse(String distanceString) {
        if (distanceString.endsWith("mi")) {
            return ofMiles(Double.parseDouble(distanceString.substring(0, distanceString.length() - 2)));
        } else if (distanceString.endsWith("km")) {
            return ofKilometers(Double.parseDouble(distanceString.substring(0, distanceString.length() - 2)));
        } else {
            throw new IllegalArgumentException("invalid distance string: " + distanceString);
        }
    }
}