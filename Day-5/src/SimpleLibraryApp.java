
import java.util.*;

class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }
}

public class SimpleLibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search by Title");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter title: ");
                String title = sc.nextLine();
                System.out.print("Enter author: ");
                String author = sc.nextLine();
                System.out.print("Enter year: ");
                int year = sc.nextInt();
                sc.nextLine(); // consume newline
                books.add(new Book(title, author, year));
                System.out.println("Book added!");
            } else if (choice == 2) {
                if (books.isEmpty()) {
                    System.out.println("No books available.");
                } else {
                    System.out.println("Books in Library:");
                    for (Book b : books) {
                        System.out.println(b);
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter title to search: ");
                String search = sc.nextLine().toLowerCase();
                boolean found = false;
                for (Book b : books) {
                    if (b.title.contains(search)) {
                        System.out.println("Found: " + b);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No book found with that title.");
                }
            } else if (choice == 0) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice! Please select 0-3.");
            }
        }
    }
}