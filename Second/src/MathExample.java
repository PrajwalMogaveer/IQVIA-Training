
import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter a decimal number (x): ");
        double x = scanner.nextDouble();


        int sum = Math.addExact(a, b);
        int diff = Math.subtractExact(a, b);
        int prod = Math.multiplyExact(a, b);
        int div = Math.floorDiv(a, b);
        int mod = Math.floorMod(a, b);

        double power = Math.pow(x, 2);
        double root = Math.sqrt(x);
        double absVal = Math.abs(x);
        double rounded = Math.round(x);
        double floored = Math.floor(x);
        double ceiled = Math.ceil(x);


        System.out.println("\n--- Results ---");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
        System.out.println("Power:"  + power);
        System.out.println("Square Root: " + root);
        System.out.println("Absolute Value: " + absVal);
        System.out.println("Rounded: " + rounded);
        System.out.println("Floor: " + floored);
        System.out.println("Ceil: " + ceiled);

        scanner.close();
    }
}

