
public class StudentInfo {


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
        printWelcome();


        displayStudentInfo("Prajwal", 21);

        int total = calculateTotalMarks(85, 90, 88);
        System.out.println("Total Marks: " + total);

        String grade = getGrade(total);
        System.out.println("Grade: " + grade);
    }
}
