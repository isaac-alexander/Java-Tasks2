// 11. Write a Java program to create a class called "Library" with a collection
// of books and methods to add and remove books.

public class Task11Library {

    // Book class to store book details
    static class Book {
        String title;
        String author;

        // Constructor
        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    // Library class to manage a collection of books
    static class Library {
        Book[] books = new Book[10]; // fixed-size collection
        int count = 0;               // number of books currently stored

        // Method to add a book
        void addBook(Book book) {
            if (count < books.length) {
                books[count] = book;
                count++;
                System.out.println("Book added: " + book.title);
            } else {
                System.out.println("Library is full. Cannot add more books.");
            }
        }

        // Method to remove a book by title
        void removeBook(String title) {
            for (int i = 0; i < count; i++) {
                if (books[i].title.equals(title)) {
                    System.out.println("Removing book: " + books[i].title);

                    // Shift remaining books to the left
                    for (int j = i; j < count - 1; j++) {
                        books[j] = books[j + 1];
                    }

                    books[count - 1] = null;
                    count--;
                    return;
                }
            }
            System.out.println("Book not found: " + title);
        }

        // Method to display all books
        void showBooks() {
            System.out.println("\nBooks in Library:");
            for (int i = 0; i < count; i++) {
                System.out.println(books[i].title + " by " + books[i].author);
            }
        }
    }

    public static void main(String[] args) {

        // Renamed variable to avoid duplicate name conflict
        Library schoolLibrary = new Library();

        // Create book objects
        Book book1 = new Book("Java Basics", "John Doe");
        Book book2 = new Book("OOP Concepts", "Mary Smith");
        Book book3 = new Book("Data Structures", "Alan Walker");

        // Add books to the library
        schoolLibrary.addBook(book1);
        schoolLibrary.addBook(book2);
        schoolLibrary.addBook(book3);

        schoolLibrary.showBooks();

        // Remove a book
        schoolLibrary.removeBook("OOP Concepts");

        // Display updated list
        schoolLibrary.showBooks();
    }
}
