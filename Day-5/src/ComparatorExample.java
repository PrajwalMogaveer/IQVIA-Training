
import java.util.*;

class Product {
    String name;
    double price;
    int rating; // out of 5

    Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " | $" + price + " | Rating: " + rating;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 75000.0, 4));
        products.add(new Product("Phone", 35000.0, 5));
        products.add(new Product("Tablet", 25000.0, 3));
        products.add(new Product("Smartwatch", 15000.0, 4));

        // 1) Sort by Price
        products.sort(Comparator.comparingDouble(p -> p.price));
        System.out.println("=== Sorted by Price ===");
        products.forEach(System.out::println);

        // 2) Sort by Rating
        products.sort(Comparator.comparingInt((Product p) -> p.rating).reversed());
        System.out.println("\n=== Sorted by Rating  ===");
        products.forEach(System.out::println);

        // 3) Sort by Name
        products.sort(Comparator.comparing(p -> p.name.toLowerCase()));
        System.out.println("\n=== Sorted by Name ===");
        products.forEach(System.out::println);
    }
}


