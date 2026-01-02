
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {

        // Create HashSet
        Set<String> fruits = new java.util.HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");

        System.out.println("Fruits: " + fruits);

        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        fruits.remove("Orange");

        System.out.println("Size: " + fruits.size());

        System.out.println("Iterating HashSet:");
        for (String f : fruits) {
            System.out.println(f);
        }
    }
}

