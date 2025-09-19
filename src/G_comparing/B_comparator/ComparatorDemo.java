package G_comparing.B_comparator;

import java.util.Arrays;
import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}

record Student(int id, int age) {}

class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age(), s2.age());
    }
}

public class ComparatorDemo {
    static void main() {
        // using natural order
        IO.println("bird".compareTo("cat")); // negative int
        IO.println("dog".compareTo("cat")); // positive int

        Comparator<String> byLength = new StringLengthComparator();
        IO.println(byLength.compare("bird", "cat")); // positive int
        IO.println(byLength.compare("dog", "cat")); // 0

        String[] stringArray = {"rabbit", "cat", "bird"};
        // Arrays.sort(stringArray); // sorts the array using natural order
        Arrays.sort(stringArray, byLength);
        // sorts the array based on the provided Comparator, byLength
        IO.println(Arrays.toString(stringArray)); // [cat, bird, rabbit]

        Student[] students = {
                new Student(56789, 19),
                new Student(12345, 21),
                new Student(11111, 20)
        };

        // Arrays.sort(students); // ClassCastException at runtime

        Comparator<Student> byAge = new StudentAgeComparator();
        Arrays.sort(students, byAge);
        IO.println("sorted ascending by age: " + Arrays.toString(students));
    }
}