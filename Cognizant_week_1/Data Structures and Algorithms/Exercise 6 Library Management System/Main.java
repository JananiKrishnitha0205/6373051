import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Algorithms", "Thomas Cormen"),
            new Book(102, "Data Structures", "Mark Allen"),
            new Book(103, "Clean Code", "Robert C. Martin"),
            new Book(104, "Design Patterns", "Erich Gamma")
        };

        // Sort array for binary search
        Arrays.sort(books, (a, b) -> a.title.compareToIgnoreCase(b.title));

        System.out.println("Search by Linear Search:");
        Book found1 = SearchFunctions.linearSearch(books, "Clean Code");
        System.out.println(found1 != null ? found1 : "Book not found");

        System.out.println("\nSearch by Binary Search:");
        Book found2 = SearchFunctions.binarySearch(books, "Clean Code");
        System.out.println(found2 != null ? found2 : "Book not found");
    }
}
