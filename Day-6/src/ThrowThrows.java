
public class ThrowThrows {

    public static void checkAge(int age) throws Exception {
        if (age < 18) {

            throw new Exception("Age must be 18 or above");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        try {
            checkAge(20);
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Handled exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
