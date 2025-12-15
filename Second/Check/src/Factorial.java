
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1; // start with 1 because factorial multiplies
        int i = 1;

        while (i <= n) {
            fact = fact * i; // multiply each number
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
        sc.close();
    }
}

