import E_adt.set.ArrayCharSet;
import E_adt.set.CharSet;

void main(String[] args) {
    String s = IO.readln("Enter a string: ");

    // how many distinct characters does s contain?

    CharSet set = new ArrayCharSet(s.length());
    // or CharSet set = new StringCharSet();

    for (char ch : s.toCharArray()) {
        set.add(ch);
    }

    IO.println(set.size()); // 4
    IO.println(set); // {Misp} (or some other order, like {iMps}
}
