public class LibrarySystem {

    // Static variable to keep track of total books
    static int totalBooks;
    
    // Instance variables
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    // Static block to initialize static variables
    static {
        totalBooks = 0;
    }

    // Constructor initialization block
    { 
        // Increment totalBooks for each object created
        totalBooks++;
    }

    // Default constructor
    public LibrarySystem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    // Overloaded constructor, correct parameter order
    public LibrarySystem(String isbn) {
        this("Unknown", "Unknown", isbn);
    }

    // Static method to get the total number of books
    public static int getTotalBooks() {
        return totalBooks;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Book is borrowed");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Thank you for returning the book");
        } else {
            System.out.println("The book is already in the library");
        }
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Corrected object creation syntax
        LibrarySystem asAManThink = new LibrarySystem("As a Man Thinketh", "James Allen", "978-0-486-27557-8");
        
        // Testing the class methods
        asAManThink.borrowBook();
        asAManThink.returnBook();
        asAManThink.returnBook();
        asAManThink.borrowBook();

        
        // Output total number of books created
        System.out.println("Total books: " + LibrarySystem.getTotalBooks());
    }
}
