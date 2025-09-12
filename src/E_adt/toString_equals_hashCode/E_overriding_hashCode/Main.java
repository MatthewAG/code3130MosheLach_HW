package E_adt.toString_equals_hashCode.E_overriding_hashCode;

public class Main {
    void main() {
        Student s1 = new Student("Jane Doe", 1234);
        Student s2 = new Student("Jane Doe", 1234);
        Object s3 = new Student("Jane Doe", 1234);

        IO.println(s1.hashCode());
        IO.println(s2.hashCode());
        IO.println(s3.hashCode());

        // They all have equal hash codes,
        // since they are equal according to the equals method,
        // and we overrode the hashCode method correctly.

        // If we had not overridden the hashCode method in the Student class,
        // in violation of the specification inherited from the Object class,
        // they would almost certainly have had three different hashCode results.
    }
}
