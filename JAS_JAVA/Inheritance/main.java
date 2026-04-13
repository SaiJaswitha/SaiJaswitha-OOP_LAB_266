import java.util.*;
class vehicle {
void fuel() {
System.out.println("It needs fuel to work");
}
}
class truck extends vehicle {
void power() {
System.out.println("It is a truck");
}
}
class Car extends vehicle{ 
void car() {
System.out.println("It is a car");
}
}
class SportsCar extends Car {
void type() {
System.out.println("It is a sports car");
}
}
public class main {
public static void main(String args[]) {
SportsCar s = new SportsCar();
truck t = new truck();
t.fuel();
t.power();
s.fuel();
s.car();
s.type();
}
}