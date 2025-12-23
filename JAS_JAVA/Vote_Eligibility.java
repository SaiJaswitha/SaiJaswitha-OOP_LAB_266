import java.util.*;
public class Vote_Eligibility
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter your age: ");
int age = sc.nextInt();
if (age>18){
System.out.println("You are Eligible to vote");
}else{
System.out.println("You are Not Eligible to vote");
}
}
}