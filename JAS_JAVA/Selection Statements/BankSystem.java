import java.util.*;
public class BankSystem {
public static void main (String args[]) {
Scanner sc = new Scanner (System.in);
System.out.println("1. Check Balance");
System.out.println("2. Deposit Money");
System.out.println("3. Withdraw Money");
System.out.println();
System.out.print("Enter your option(1 or 2 or 3): ");
int option = sc.nextInt();
System.out.println();
double bal = 20000;
if (option == 1){
System.out.println("Your current balance is Rs. " +bal+ "/-");
} else if (option == 2) {
System.out.print("Enter amount to deposit: ");
double deposit = sc.nextInt();
if (deposit > 0){
bal += deposit;
System.out.println("Rs." +deposit+ "/- is successfully deposited.");
System.out.println("Now customer's total balance is Rs." +bal+ "/-");
} else {
System.out.println("Invalid deposit amount");
}
} else if (option == 3) {
System.out.print("Enter amount to withdraw: ");
double withdraw = sc.nextInt();
if (bal >= withdraw){
bal -= withdraw;
System.out.println("Rs." +withdraw+ "/- has been successfully withdrawn.");
System.out.println("Now customer's total balance is Rs." +bal+ "/-");
} else {
System.out.println("Insufficient Balance!");
}
} else {
System.out.println("You entered invalid option");
}
}
}
