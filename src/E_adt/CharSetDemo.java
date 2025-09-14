import E_adt.set.ArrayCharSet;
import E_adt.set.CharSet;

void main() {
    String s = IO.readln("Enter a string: ");

    // How many distinct characters does s contain?

    CharSet set = new ArrayCharSet(s.length());
    // or: CharSet set = new StringCharSet();
    // we'd also import E_adt.set.StringCharSet

    for (char ch : s.toCharArray()) {
        set.add(ch);
    }

    IO.println(set.size()); // 4
    IO.println(set); // the distinct characters in some order
}
