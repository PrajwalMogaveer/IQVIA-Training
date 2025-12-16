
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.add(1, "Mango");

        System.out.println("Fruits List: " + fruits);

        System.out.println("Element at index 2: " + fruits.get(2));

        fruits.set(0, "Papaya");

        fruits.remove("Orange");
        fruits.remove(1);

        System.out.println("Updated Fruits List: " + fruits);

        System.out.println("\nIterating:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
