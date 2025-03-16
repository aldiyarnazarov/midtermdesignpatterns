import java.util.UUID;

class Transaction {
    String id;
    double amount;
    String method;
    String status;

    public Transaction(double amount, String method, boolean success) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.method = method;
        this.status = success ? "Completed" : "Failed";
    }

    @Override
    public String toString() {
        return "Transaction ID: " + id + ", Amount: $" + amount + ", Method: " + method + ", Status: " + status;
    }
}