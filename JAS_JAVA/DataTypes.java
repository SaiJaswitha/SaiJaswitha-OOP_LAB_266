import java.util.*;
public class DataTypes {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = sc.nextLine();
System.out.print("Enter your age: ");
int age = sc.nextInt();
System.out.print("Are you a student? (true/false): ");
boolean isStudent = sc.nextBoolean();
System.out.print("Enter your salary: ");
double salary = sc.nextDouble();
System.out.print("Enter your grade (A, B, C, etc.): ");
char grade = sc.next().charAt(0);
System.out.print("Estimate the worlds population: ");
long population = sc.nextLong();
System.out.print("Enter a simple floating-point value: ");
float simpleFloat = sc.nextFloat();
System.out.print("Enter a simple byte number (e.g., 25): ");
byte simpleByte = sc.nextByte();
}
}