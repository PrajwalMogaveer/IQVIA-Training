
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
