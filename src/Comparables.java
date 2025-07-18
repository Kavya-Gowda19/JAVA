package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student2 implements Comparable<Student2> {
    int age;
    String name;

    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int compareTo(Student2 other) {
        // Ascending order based on age
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Comparables{
    public static void main(String[] args) {
        List<Student2> sud = new ArrayList<>();
        sud.add(new Student2(21, "kavya"));
        sud.add(new Student2(31, "navya"));
        sud.add(new Student2(51, "bhavya"));
        sud.add(new Student2(11, "janu"));
        sud.add(new Student2(81, "ananya"));
        sud.add(new Student2(1, "spoorti")); // avoid 01

        Collections.sort(sud); // uses compareTo()

        for (Student2 s : sud) {
            System.out.println(s);
        }
    }
}
