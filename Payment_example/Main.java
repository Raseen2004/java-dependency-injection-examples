package dependency_injection_learning.Payment_example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PaymentService paymentService;

        while (true) {

            System.out.println("Select Payment Method");
            System.out.println("1. Credit Card");
            System.out.println("2. UPI");
            System.out.println("3. PayPal");

            int choice = sc.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice! Try again.\n");
                continue;
            }

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            switch (choice) {
                case 1:
                    paymentService = new PaymentService(new CreditCardPayment());
                    break;
                case 2:
                    paymentService = new PaymentService(new UPIPayment());
                    break;
                default:
                    paymentService = new PaymentService(new PayPalPayment());
            }

            paymentService.makePayment(amount);
            break;
        }

        sc.close();
    }
}