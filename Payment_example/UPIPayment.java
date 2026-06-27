package dependency_injection_learning.Payment_example;

public class UPIPayment implements PaymentProvider{
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}
