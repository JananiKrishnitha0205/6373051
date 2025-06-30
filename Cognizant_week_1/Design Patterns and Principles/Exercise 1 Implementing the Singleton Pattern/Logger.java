public class Logger {
    // Step 1: Create a private static instance of the same class
    private static Logger instance;

    // Step 2: Make the constructor private to prevent instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Step 3: Provide a public static method to return the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Sample method to log messages
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
