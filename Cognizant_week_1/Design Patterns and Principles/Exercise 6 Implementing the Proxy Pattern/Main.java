public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("nature.jpg");

        // First time - loads image
        System.out.println("\nFirst display:");
        img1.display();

        // Second time - uses cache
        System.out.println("\nSecond display:");
        img1.display();
    }
}
