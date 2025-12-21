// 11. Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.

// Task 11:
// This class manages a collection of library books.

public class Library {

    LibraryBook[] books = new LibraryBook[10]; // stores library books
    int count = 0;                             // number of books stored

    // Method to add a book to the library
    void addBook(LibraryBook book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added: " + book.title);
        } else {
            System.out.println("Library is full.");
        }
    }

    // Method to remove a book using the title
    void removeBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equals(title)) {
                System.out.println("Removing book: " + books[i].title);

                // Shift remaining books left
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
        System.out.println("\nBooks in the Library:");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].title + " by " + books[i].author);
        }
    }
}
