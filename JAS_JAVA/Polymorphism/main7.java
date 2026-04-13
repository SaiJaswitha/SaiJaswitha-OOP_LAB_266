import java.util.Scanner;

class Bank {

    double balance = 0;

    // Cash deposit
    void deposit(double amount) {
        balance += amount;
        System.out.println("Cash deposit: " + amount);
    }

    // Cheque deposit
    void deposit(double amount, String chequeNo) {
        balance += amount;
        System.out.println("Cheque deposit: " + amount + " | Cheque No: " + chequeNo);
    }

    // Online transfer
    void deposit(double amount, String upi, int type) {
        balance += amount;
        System.out.println("Online transfer: " + amount + " | UPI: " + upi);
    }

    void showBalance() {
        System.out.println("Total Balance: " + balance);
    }
}

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.println("1. Cash  2. Cheque  3. Online");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.print("Enter amount: ");
            double amt = sc.nextDouble();
            b.deposit(amt);
        }
        else if(choice == 2) {
            System.out.print("Enter amount: ");
            double amt = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter cheque number: ");
            String ch = sc.nextLine();
            b.deposit(amt, ch);
        }
        else if(choice == 3) {
            System.out.print("Enter amount: ");
            double amt = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter UPI ID: ");
            String upi = sc.nextLine();
            b.deposit(amt, upi, 1);
        }

        b.showBalance();
    }
}