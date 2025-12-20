// 5. Write a Java program to create a class called "Book" with attributes for
// title, author, and ISBN, and methods to add and remove books from a collection.

public class Book {

        String title;
        String author;
        String isbn;

        // Constructor
        Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

    static class BookCollection {
        Book[] books = new Book[10]; // simple fixed-size collection
        int count = 0;               // tracks how many books we currently have

        // Method to add a book
        void addBook(Book b) {
            if (count < books.length) {
                books[count] = b;
                count++;
                System.out.println("Book added: " + b.title);
            } else {
                System.out.println("Collection is full. Cannot add more books.");
            }
        }

        // Method to remove a book by ISBN
        void removeBook(String isbn) {
            for (int i = 0; i < count; i++) {
                if (books[i].isbn.equals(isbn)) {
                    System.out.println("Removing book: " + books[i].title);

                    // Shift elements left
                    for (int j = i; j < count - 1; j++) {
                        books[j] = books[j + 1];
                    }

                    books[count - 1] = null;
                    count--;
                    return;
                }
            }
            System.out.println("Book with ISBN " + isbn + " not found.");
        }

        // Method to display all books
        void showBooks() {
            System.out.println("\nBooks in Collection:");
            for (int i = 0; i < count; i++) {
                System.out.println(books[i].title + " by " + books[i].author + " (ISBN: " + books[i].isbn + ")");
            }
        }
    }

}
