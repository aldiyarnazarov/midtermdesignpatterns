import java.util.Random;

class CryptoPayment implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment: $" + amount);
        return new Random().nextBoolean(); // Simulating success or failure
    }
}