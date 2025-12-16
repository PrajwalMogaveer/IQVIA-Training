
import java.util.*;

class Learner implements Comparable<Learner> {
    String name;
    int age;

    Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Learner other) {
        int byName = this.name.compareToIgnoreCase(other.name);
        if (byName != 0)
            return byName;
        else {
            return Integer.compare(this.age, other.age);
        }
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class ComparableSorting {
    public static void main(String[] args) {
        List<Learner> students = new ArrayList<>();
        students.add(new Learner("Prajwal", 21));
        students.add(new Learner("Rahul", 20));
        students.add(new Learner("Pavan", 18));
        students.add(new Learner("prajwal", 19));
        students.add(new Learner("Rahul", 19));

        Collections.sort(students);

        System.out.println("Sorted");
        for (Learner s : students) {
            System.out.println(s);
        }
    }
}