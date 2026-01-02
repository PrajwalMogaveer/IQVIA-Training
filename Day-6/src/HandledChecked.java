
import java.io.FileReader;
import java.io.IOException;

public class HandledChecked {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
            System.out.println("Reader created: " + reader);
        } catch (IOException e) {
            System.out.println("Error: Could not open file. Reason: " + e.getMessage());
        }

        System.out.println("Program continues without crashing.");
    }
}

