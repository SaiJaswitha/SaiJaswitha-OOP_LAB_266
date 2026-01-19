import java.util.*;
public class SimpleCalculator {
public static void main (String args[]) {
Scanner sc = new Scanner (System.in);
System.out.print("Enter first number: ");
double num1 = sc.nextDouble();
System.out.print("Enter second number: ");
double num2 = sc.nextDouble();
System.out.print("Enter operator number(1 for + or 2 for - or 3 for * or 4 for /) : ");
int op = sc.nextInt();
switch (op) {
case 1 :
System.out.print(num1+ " + " +num2+ " = " +(num1+num2));
break;
case 2 :
System.out.print(num1+ " - " +num2+ " = " +(num1-num2));
break;
case 3 :
System.out.print(num1+ " * " +num2+ " = " +(num1*num2));
break;
case 4 :
if (num2 == 0){
System.out.println("0 can't divide a number");
break;
} else {
System.out.print(num1+ " / " +num2+ " = " +(num1/num2));
break;
}
default :
System.out.println("You entered invalid operator number");
}
}
}
