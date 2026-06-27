package dependency_injection_learning.Notification_example;

public class EmailProvider implements NotificationProvider {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println(message+" "+recipient);
    }
}
