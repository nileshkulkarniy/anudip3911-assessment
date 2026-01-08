interface NotificationService {
    void sendNotification(String message);
}
class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification: " + message);
    }
}
class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
class PushNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Push Notification: " + message);
    }
}
interface NotificationFactory {
    NotificationService getNotificationService(String type);
}
class NotificationFactoryImpl implements NotificationFactory {
    @Override
    public NotificationService getNotificationService(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } 
        else if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        } 
        else if (type.equalsIgnoreCase("push")) {
            return new PushNotification();
        } 
        else {
            return null;
        }
    }
}
public class NotificationSystem {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactoryImpl();
        NotificationService service;
        service = factory.getNotificationService("email");
        service.sendNotification("Your email has been sent successfully");
        service = factory.getNotificationService("sms");
        service.sendNotification("Your OTP is 8547");
        service = factory.getNotificationService("push");
        service.sendNotification("You have a new message");
    }
}
