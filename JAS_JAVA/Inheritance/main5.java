class shape {
void shape() {
System.out.println("Calculating area of rectangle");
}
}
class rect extends shape {
float l,b;
rect(float l,float b) {
this.l = l;
this.b = b;
}
void displayArea() {
super.shape();
System.out.println("Area of rectangle :"+(l*b));
}
}
public class main5 {
public static void main (String args[]) {
rect r = new rect(4,7);
r.displayArea();
}
}