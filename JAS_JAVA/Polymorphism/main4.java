class Shape {
    void calcArea() {
        System.out.println("Calculating Area...");
    }
}

class Circle extends Shape {
    float r;

    Circle(float r) {
        this.r = r;
    }
    void calcArea() {
        super.calcArea();
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

class Rect extends Shape {
    float l, b;

    Rect(float l, float b) {
        this.l = l;
        this.b = b;
    }
    void calcArea() {
        super.calcArea();
        System.out.println("Area of Rectangle: " + (l * b));
    }
}

class Triangle extends Shape {
    float b, h;

    Triangle(float b, float h) {
        this.b = b;
        this.h = h;
    }
    void calcArea() {
        super.calcArea();
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

public class Main {
    public static void main(String args[]) {

        Shape c = new Circle(3);
        Shape r = new Rect(4, 7);
        Shape t = new Triangle(4, 2);

        c.calcArea();
        r.calcArea();
        t.calcArea();
    }
}