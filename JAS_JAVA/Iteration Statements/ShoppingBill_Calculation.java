import java.util.*;
public class ShoppingBill_Calculation {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter total number of different items purchased by the customer: ");
int n = sc.nextInt();
double TotalAmt = 0;
for (int i=1; i<=n; i++) {
System.out.println();
System.out.println("Item No. " +i);
System.out.print("Enter item name: ");
String ItemName = sc.next();
System.out.print("Enter per item price: ");
double ItemPrice = sc.nextDouble();
System.out.print("Enter item quantity: ");
int ItemQty = sc.nextInt();
double ItemTotal = ItemPrice * ItemQty;
TotalAmt += ItemTotal;
System.out.println("Total price of " +ItemName+ "is Rs." +ItemTotal);
}
System.out.println("--> Final total bill amount for all items = Rs." +TotalAmt);
}
}