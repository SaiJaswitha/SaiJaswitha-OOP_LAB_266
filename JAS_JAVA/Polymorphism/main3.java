class notification {
void send() {
System.out.println("Notification!!!!");
}
}
class EmailNotification extends notification {
void send() {
super.send();
System.out.println("Notification from Email");
}
}
class SMSNotification extends notification {
void send() {
super.send();
System.out.println("Notification from SMS");
}
}
public class main3 {
public static void main(String args[]) {
notification s1 = new EmailNotification();
notification s2 = new SMSNotification();
s1.send();
s2.send();
}
}