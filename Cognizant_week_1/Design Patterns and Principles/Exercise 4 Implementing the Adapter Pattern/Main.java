public class Main {
    public static void main(String[] args) {
        // Using Stripe via Adapter
        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripePayment = new StripeAdapter(stripe);
        stripePayment.processPayment(2500);

        // Using PayPal via Adapter
        PayPalGateway paypal = new PayPalGateway();
        PaymentProcessor paypalPayment = new PayPalAdapter(paypal);
        paypalPayment.processPayment(1800);
    }
}
