
import java.util.Scanner;

public class StudentInfoo {

    public static void printWelcome() {
        System.out.println("Student Information System!");
    }

    public static int calculateTotalMarks(int subject1, int subject2, int subject3) {
        return subject1 + subject2 + subject3;
    }

    public static String getGrade(int totalMarks) {
        if (totalMarks >= 270) return "A";
        else if (totalMarks >= 200) return "B";
        else return "C";
    }

    public static void displayStudentInfo(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        printWelcome();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        System.out.print("Enter marks for Subject 1: ");
        int subject1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = sc.nextInt();

        System.out.println("\n--- Student Details ---");
        displayStudentInfo(name, age);

        int total = calculateTotalMarks(subject1, subject2, subject3);
        String grade = getGrade(total);

        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

