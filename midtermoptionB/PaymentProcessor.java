import java.util.List;
import java.util.ArrayList;

class PaymentProcessor {
    private final List<Transaction> transactionHistory = new ArrayList<>();

    public void process(String methodType, double amount) {
        try {
            PaymentMethod method = PaymentFactory.getPaymentMethod(methodType);
            boolean success = method.processPayment(amount);
            Transaction transaction = new Transaction(amount, methodType, success);
            transactionHistory.add(transaction);
            System.out.println(transaction);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }
    }
}