package practice.oops.polymorphism.method_overriding;
class Notification {
    public void sendNotification(){
        System.out.println("Sending the Notification");
    }
}
class EmailNotification extends Notification {
    @Override
    public void sendNotification(){
        System.out.println("Sending the Email Notification");
    }
}
class SMSNotification extends Notification{
    @Override
    public void sendNotification(){
        System.out.println("Sending the SMS Notification");
    }
}
class PushNotification extends Notification{
    @Override
    public void sendNotification(){
        System.out.println("Sending the Push Notification");
    }
}
public class Notify {
    static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        Notification push = new PushNotification();
        email.sendNotification();
        sms.sendNotification();
        push.sendNotification();
    }
}
