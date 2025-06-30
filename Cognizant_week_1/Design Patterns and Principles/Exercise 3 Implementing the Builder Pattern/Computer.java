public class Computer {
    // Required parts
    private String CPU;
    private String RAM;

    // Optional parts
    private String storage;
    private String graphicsCard;
    private String keyboard;
    private String monitor;

    // Private constructor — can only be built through Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.keyboard = builder.keyboard;
        this.monitor = builder.monitor;
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private String keyboard;
        private String monitor;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setMonitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer Configuration:\n" +
               "CPU: " + CPU + "\n" +
               "RAM: " + RAM + "\n" +
               "Storage: " + storage + "\n" +
               "Graphics Card: " + graphicsCard + "\n" +
               "Keyboard: " + keyboard + "\n" +
               "Monitor: " + monitor;
    }
}
