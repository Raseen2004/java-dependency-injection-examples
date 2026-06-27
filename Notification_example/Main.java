package dependency_injection_learning.Notification_example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService;

        Scanner sn = new Scanner(System.in);

        while(true) {
            System.out.println("Enter 1 for Email and 2 for SMS ");
            int choice = sn.nextInt();
            switch (choice) {
                case 1:
                    notificationService = new NotificationService(new EmailProvider());
                    notificationService.sendNotification("Welcome", "demo@gmail.com");
                    sn.close();
                    return;
                case 2:
                    notificationService = new NotificationService(new SMSProvider());
                    notificationService.sendNotification("Welcome", "924548675");
                    sn.close();
                    return;
                default:
                    System.out.println("Enter valid number: ");
                    break;
            }
        }
    }
}
