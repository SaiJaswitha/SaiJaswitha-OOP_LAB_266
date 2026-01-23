import java.util.*;
public class factorial_prime_fibonacci {
public static void main (String args[]) {
Scanner sc = new Scanner (System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
System.out.println();
int fact = 1;
if (num < 0) {
System.out.println("--> No factorial for negative numbers.");
} else {
int temp = num;
while (temp > 0) {
fact *= temp;
temp--;
} 
System.out.println("--> Factorial of " +num+ " is " +fact);
}
boolean isPrime = true;
if (num <= 0) {
System.out.println("--> " +num+ " is neither prime nor composite");
} else {
for (int i=2; i<num; i++) {
if (num%i == 0) {
isPrime = false;
break;
}
}
if (isPrime) {
System.out.println("--> " +num + " is a prime number.");
} else {
System.out.println("--> " +num + " is not a prime number.");
}
}
System.out.print("--> Fibonacci Series: ");
int a = 0;
int b = 1;
for(int i=0; i<=num; i++) {
System.out.print(a+ " ");
int next = a+b;
a = b;
b = next;
}
}
}