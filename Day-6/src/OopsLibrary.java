
import java.util.*;

class LibraryResource {
    private final String title;

    public LibraryResource(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Item: " + title;
    }
}

class Book extends LibraryResource {
    private final String author;
    private final int year;

    public Book(String title, String author, int year) {
        super(title);            // initialize title in the base class
        this.author = author;
        this.year = year;
    }

    public String getAuthor() { return author; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return getTitle() + " by " + author + " (" + year + ")";
    }
}

class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) { super(message); }
}

class InvalidUserException extends Exception {
    public InvalidUserException(String message) { super(message); }
}

public class OopsLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Book> books = new ArrayList<>();

        books.add(new Book("Clean Code", "Robert", 2008));
        books.add(new Book("Effective Java", "Joshua", 2018));
        books.add(new Book("The Programmer", "Andrew Hunt", 1999));

        try {
            login(sc);
            System.out.println("Login successful!\n");
        } catch (InvalidUserException e) {
            System.out.println("Login failed: " + e.getMessage());
            sc.close();
            return;
        }

        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search by Title");
            System.out.println("4. Delete by Title");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                if (choice == 1) {
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    books.add(new Book(title, author, year));
                    System.out.println("Book added!");

                } else if (choice == 2) {

                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : books) {
                            System.out.println(b); // calls Book.toString()
                        }
                    }

                } else if (choice == 3) {
                    System.out.print("Enter title to search: ");
                    String search = sc.nextLine();
                    Book found = findBookByTitle(books, search); // may throw
                    System.out.println("Found: " + found);

                } else if (choice == 4) {

                    System.out.print("Enter title to delete: ");
                    String title = sc.nextLine();
                    Book found = findBookByTitle(books, title); // may throw
                    books.remove(found);
                    System.out.println("Deleted: " + found);

                } else if (choice == 0) {
                    System.out.println("Exiting...");
                    break;

                } else {
                    System.out.println("Invalid choice! Please select 0-4.");
                }

            } catch (BookNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
                break;
            }
        }

        sc.close();
    }


    private static void login(Scanner sc) throws InvalidUserException {
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (!(user.equals("Prajwal") && pass.equals("12345"))) {
            throw new InvalidUserException("Invalid username or password.");
        }
    }

    private static Book findBookByTitle(List<Book> books, String title)
            throws BookNotFoundException {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        throw new BookNotFoundException("Book with title \"" + title + "\" not found.");
    }
}
