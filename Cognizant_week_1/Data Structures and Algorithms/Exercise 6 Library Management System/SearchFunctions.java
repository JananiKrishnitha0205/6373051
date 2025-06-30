import java.util.Arrays;

public class SearchFunctions {

    // Linear Search
    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search
    public static Book binarySearch(Book[] books, String targetTitle) {
        int left = 0, right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = targetTitle.compareToIgnoreCase(books[mid].title);

            if (compare == 0) return books[mid];
            else if (compare < 0) right = mid - 1;
            else left = mid + 1;
        }

        return null;
    }
}
