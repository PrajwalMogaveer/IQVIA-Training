
import java.io.FileReader;
import java.io.IOException;

public class UnhandledCheckedExample {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("data.txt");
        System.out.println("Reader created: " + reader);
    }
}

