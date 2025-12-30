import java.util.*;
public class DataOperations1 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter first number: ");
double a = sc.nextDouble();
sc.nextLine();
System.out.print("Enter second number: ");
double b = sc.nextDouble();
sc.nextLine();
double sum=a+b;
double diff=a-b;
double pro=a*b;
double div=a/b;     
double modu=a%b;
System.out.println();
System.out.println("------------------------------------------------------------------------------");
System.out.println();
System.out.println("Sum, difference, product, division and modulo of given two numbers");
System.out.println();
System.out.println("Sum: "+sum);
System.out.println("Difference: "+diff);
System.out.println("Product: "+pro);
System.out.println("Division: "+div);
System.out.println("Modulo:"+modu);
}
}


