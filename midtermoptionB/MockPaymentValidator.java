import java.util.Random;

class MockPaymentValidator {
    public static boolean validateCreditCard() {
        return new Random().nextBoolean();
    }
}