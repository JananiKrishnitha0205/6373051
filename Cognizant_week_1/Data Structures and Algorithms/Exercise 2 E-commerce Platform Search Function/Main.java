import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Bag", "Accessories"),
            new Product(105, "Watch", "Accessories")
        };

        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        Product result1 = SearchFunction.linearSearch(products, "Shoes");
        Product result2 = SearchFunction.binarySearch(products, "Shoes");

        System.out.println("Linear Search Result: " + result1);
        System.out.println("Binary Search Result: " + result2);
    }
}
