
class Studentt {
    String name;
    int rollNo;
    int marks;
    int totalClasses;
    int attendedClasses;

    // Constructor
    Studentt(String name, int rollNo, int marks, int totalClasses, int attendedClasses) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    // Method
    String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    // Method
    double calculateAttendance() {
        return (attendedClasses * 100.0) / totalClasses;
    }

    // Method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.printf("Attendance: %.2f%%\n", calculateAttendance());
        System.out.println("----------------------");
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Studentt s1 = new Studentt("Prajwal", 101, 85, 40, 32);
        Studentt s2 = new Studentt("Aarav", 102, 72, 40, 28);

        s1.displayDetails();
        s2.displayDetails();
    }
}


