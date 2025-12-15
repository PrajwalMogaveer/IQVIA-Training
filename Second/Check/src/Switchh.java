import java.util.Scanner;
public class Switchh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = sc.nextInt();


        int remainder = number % 2;

        switch (remainder) {
            case 0:
                System.out.print(number + " is Even.");
                break;
            case 1:
                System.out.print(number + " is Odd.");
                break;
            default:
                System.out.print
                        ("Unexpected value!");
        }
    }
}

