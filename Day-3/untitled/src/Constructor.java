
class Student {
    String name;
    int rollNo;


    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student("Prajwal", 101);
        Student s2 = new Student("Aarav", 102);

        s1.displayDetails();
        s2.displayDetails();
    }
}


