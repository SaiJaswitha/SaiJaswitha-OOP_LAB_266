abstract class Vehicle {
abstract void start();
void stop() {
System.out.println("Vehicle stopped");
}
}
class Bike extends Vehicle {
void start() {
System.out.println("Bike started");
}
}
public class main1 {
public static void main(String args[]) {
Bike b = new Bike();
b.start();
b.stop();
}
}