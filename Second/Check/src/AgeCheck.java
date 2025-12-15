
import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 ages (skip invalid ages):");
        int count = 0;

        while (count < 5) {
            System.out.print("Age " + (count + 1) + ": ");
            int age = sc.nextInt();

            if (age <= 0) {
                System.out.println("Invalid age!");
                continue; // skip invalid input
            }

            System.out.println("Valid age: " + age);
            count++;
        }

        System.out.println("Done!");
        sc.close();
    }
}

