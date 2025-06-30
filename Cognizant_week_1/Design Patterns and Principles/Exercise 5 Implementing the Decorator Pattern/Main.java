public class Main {
    public static void main(String[] args) {
        // Basic email notifier
        Notifier email = new EmailNotifier();

        // Add SMS and Slack notifications dynamically
        Notifier sms = new SMSNotifierDecorator(email);
        Notifier slack = new SlackNotifierDecorator(sms);

        System.out.println("Sending notification through Email, SMS, and Slack:");
        slack.send("Server down! Immediate attention needed.");
    }
}
