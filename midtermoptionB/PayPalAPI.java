import java.util.Random;

class PayPalAPI {
    public boolean sendPayment(double amount) {
        System.out.println("Processing payment via PayPal API: $" + amount);
        return new Random().nextBoolean();
    }
}