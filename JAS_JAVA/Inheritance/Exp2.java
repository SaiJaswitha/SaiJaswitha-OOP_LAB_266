class Calculator {

    Calculator(int a, int b) {

        int sum = a + b;
        System.out.println("Sum of two numbers: " + sum);

    }

    Calculator(int a, int b, int c) {

        int sum = a + b + c;
        System.out.println("Sum of three numbers: " + sum);

    }

    Calculator(int a, int b, int c, int d) {

        int sum = a + b + c + d;
        System.out.println("Sum of four numbers: " + sum);

    }

}

public class Exp1 {

    public static void main(String args[]) {

        Calculator c1 = new Calculator(5, 10);
        Calculator c2 = new Calculator(3, 4, 5);
        Calculator c3 = new Calculator(2, 3, 4, 5);

    }

}