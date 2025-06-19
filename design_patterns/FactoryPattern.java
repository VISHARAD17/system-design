interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Email Notification Send");
    }
}

class SMSNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("SMS Notification Send");
    }
}


public class FactoryPattern {
    public static void main(String[] args) {
        Notification notification = createNotification("SMS");
        notification.notifyUser();
    }

    public static Notification createNotification(String type) {
        switch (type) {
            case "EMail":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
};
