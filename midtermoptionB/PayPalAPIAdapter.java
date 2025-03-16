class PayPalAPIAdapter implements PaymentMethod {
    private final PayPalAPI payPalAPI;

    public PayPalAPIAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public boolean processPayment(double amount) {
        return payPalAPI.sendPayment(amount);
    }
}