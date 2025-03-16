class PayPalPayment implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        PayPalAPIAdapter payPalAdapter = new PayPalAPIAdapter(new PayPalAPI());
        return payPalAdapter.processPayment(amount);
    }
}