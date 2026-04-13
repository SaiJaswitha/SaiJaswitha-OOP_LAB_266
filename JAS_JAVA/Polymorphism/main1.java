class shape {
void displayArea() {
System.out.println("Area of a Shape");
}
}
class circle extends shape {
float r;
circle(float r) {
this.r = r;
}
void displayArea() {
super.displayArea();
System.out.print("Area of Circle: "+(3.14*r*r));
}
}
class rect extends shape {
float l,b;
rect(float l,float b) {
this.l = l;
this.b = b;
}
void displayArea(float l, float b) {
super.displayArea();
System.out.println("Area of Rectangle: ");
}
}
public class main1 {
public static void main(String args[]) {
shape s1 = new circle(3);
shape s2 = new rect(4,6);
s1.displayArea();
s2.displayArea();
}
}