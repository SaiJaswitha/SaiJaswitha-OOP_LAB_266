public class shape {
void calcArea() {
System.out.println("Calculating Area.....");
}
}
public class circle extends shape {
float r;
void calcArea(float r) {
super.calcArea();
System.out.println("Area of the circle: "+(3.14*r*r);
}
}
public class rect extends shape {
float l,b;
void calcArea(float l,float b) {
super.calcArea();
System.out.println("Area of the rectangle: "+(l*b));
}
}
public class triangle extends shape {
float b,h;
void calcArea() {
super.calcArea(float b,float h);
System.out.println("Area of the tiangle: "+(0.5*b*h);
}
}
public class main4 {
public static void main(String ars[]) {
shape c = new circle(3);
shape r = new rect(4,7);
shape t = new triangle(4,2);
}
}