package dependency_injection_learning.Payment_example;

public class PaymentService {
    private PaymentProvider paymentProvider;

    public PaymentService(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public void makePayment(double amount) {
        paymentProvider.pay(amount);
    }
}
