//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Exec

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create scanner for keyboard input

        // 1) Read name (full line)
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // 2) Read age (integer)
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // 3) Read marks (decimal)
        System.out.print("Enter your marks (out of 100): ");
        double marks = sc.nextDouble();

        // Optional: compute grade
        char grade = 'E';
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 60) grade = 'C';
        else if (marks >= 40) grade = 'D';


        // 4) Print formatted output using printf
        System.out.println("\n--- Student Summary ---");
        System.out.printf("Name : %s%n", name);
        System.out.printf("Age  : %d years%n", age);
        System.out.printf("Marks: %.2f / 100%n", marks);   // 2 decimal places
        System.out.printf("Grade: %c%n", grade);

        sc.close();  // good practice
    }
}
