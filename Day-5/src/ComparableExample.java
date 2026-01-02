
import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return age + " - " + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(18, "Pavan"));
        students.add(new Student(21, "Prajwal"));
        students.add(new Student(20, "Rahul"));

        Collections.sort(students);


        for (Student s : students) {
            System.out.println(s);
        }
    }
}

