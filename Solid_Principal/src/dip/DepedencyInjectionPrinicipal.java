package dip;

//Abstraction
interface Notification {
 void send(String message);
}

//Low-level Module 1
class EmailService implements Notification {
 public void send(String message) {
     System.out.println("Sending Email: " + message);
 }
}

//Low-level Module 2
class SMSService implements Notification {
 public void send(String message) {
     System.out.println("Sending SMS: " + message);
 }
}

//High-level Module
class NotificationService {
 private Notification notification;

 // Constructor Injection of dependency
 public NotificationService(Notification notification) {
     this.notification = notification;
 }

 public void notify(String message) {
     notification.send(message);
 }
}

//Client code
public class DepedencyInjectionPrinicipal {
 public static void main(String[] args) {
     Notification emailService = new EmailService();
     NotificationService notificationService = new NotificationService(emailService);
     notificationService.notify("Hello World!");

     Notification smsService = new SMSService();
     notificationService = new NotificationService(smsService);
     notificationService.notify("Hello World via SMS!");
 }
}

