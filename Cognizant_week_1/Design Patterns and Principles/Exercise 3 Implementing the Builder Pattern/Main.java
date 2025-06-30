public class Main {
    public static void main(String[] args) {
        // Basic computer
        Computer basicPC = new Computer.Builder("Intel i5", "8GB")
                .setStorage("256GB SSD")
                .build();

        // Gaming computer
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setKeyboard("Mechanical RGB")
                .setMonitor("32-inch 4K")
                .build();

        System.out.println("----- Basic PC -----");
        System.out.println(basicPC);

        System.out.println("\n----- Gaming PC -----");
        System.out.println(gamingPC);
    }
}
