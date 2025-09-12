package E_adt.set;

/**
 * A CharSet whose elements are stored in a fixed-length array.
 */
public class ArrayCharSet implements CharSet {
    /*
    Representation: the characters are stored in an array.
    The capacity is the array's length.
    The elements are stored at indexes 0 through (size - 1).
    For example, if size is 3, the elements are stored at indexes 0, 1, and 2.
    We only care about what's at indexes 0 through (size - 1);
    we don't care about what's at index size and beyond.
    */

    private final char[] chars;
    private int size;

    /**
     * Creates a set of characters with the specified capacity.
     * @param capacity the number of characters that this set can hold at one time
     */
    public ArrayCharSet(int capacity) {
        chars = new char[capacity];
        size = 0;
    }

    @Override
    public boolean add(char ch) {
        if (isFull() || contains(ch)) {
            return false;
        } else {
            chars[size] = ch;
            size++;
            return true;
        }
    }

    @Override
    public boolean remove(char ch) {
        int index = indexOf(ch);

        if (index < 0) {
            return false;
        } else {
            chars[index] = chars[size - 1]; // replace ch with the last character
            size--;

            /*
            Note 1: We just changed the order of the elements, but that's OK since
            order doesn't matter in a set.

            Note 2: The array now contains two occurrences of the same character:
            chars[index] == chars[size]. But that's OK since we only care about
            what's at indexes 0 through (size - 1).
            */

            return true;
        }
    }

    @Override
    public boolean contains(char ch) {
        return indexOf(ch) >= 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return chars.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");

        for (int i = 0; i < size; i++) {
            sb.append(chars[i]);
        }

        return sb.append("}").toString();
    }

    private int indexOf(char ch) {
        for (int i = 0; i < size; i++) {
            if (chars[i] == ch) {
                return i;
            }
        }

        return -1;
    }
}