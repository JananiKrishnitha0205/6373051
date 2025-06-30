public class Main {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Concrete commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        System.out.println("Turning the light ON:");
        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println("\nTurning the light OFF:");
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
