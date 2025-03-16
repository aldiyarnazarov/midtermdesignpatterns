import java.util.Scanner
        ;
public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor processor = new PaymentProcessor();

        while (true) {
            System.out.println("Choose payment method (creditcard, paypal, crypto) or type 'history' to view transactions, 'exit' to quit:");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("exit")) break;
            if (choice.equals("history")) {
                processor.showTransactionHistory();
                continue;
            }

            System.out.println("Enter payment amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            processor.process(choice, amount);
        }
    }
}