class Shape {
String shape;
Shape () {
System.out.println("Shape object created");
}
}
class Circle extends Shape {
Circle(double r) {
super();
double area = 3.14*r*r;
System.out.println("Area of Circle:"+area);
}
}
public class Exp2{
public static void main(String args[]) {
Circle c = new Circle(3);
}
}