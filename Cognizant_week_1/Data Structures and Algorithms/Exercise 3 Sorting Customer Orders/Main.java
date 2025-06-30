public class Main {
    public static void main(String[] args) {
        // Original dataset
        Order[] orders = {
            new Order(1, "Alice", 2500.0),
            new Order(2, "Bob", 1800.0),
            new Order(3, "Charlie", 3200.0),
            new Order(4, "Diana", 1500.0)
        };

        // Bubble Sort
        System.out.println("Before Bubble Sort:");
        for (Order o : orders) System.out.println(o);

        BubbleSort.sort(orders);
        System.out.println("\nAfter Bubble Sort (Ascending):");
        for (Order o : orders) System.out.println(o);

        // Resetting array for Quick Sort
        Order[] orders2 = {
            new Order(1, "Alice", 2500.0),
            new Order(2, "Bob", 1800.0),
            new Order(3, "Charlie", 3200.0),
            new Order(4, "Diana", 1500.0)
        };

        System.out.println("\nBefore Quick Sort:");
        for (Order o : orders2) System.out.println(o);

        QuickSort.sort(orders2, 0, orders2.length - 1);
        System.out.println("\nAfter Quick Sort (Ascending):");
        for (Order o : orders2) System.out.println(o);
    }
}
