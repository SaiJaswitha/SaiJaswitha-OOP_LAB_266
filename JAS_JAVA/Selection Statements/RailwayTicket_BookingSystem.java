import java.util.*;
public class RailwayTicket_BookingSystem {
public static void main (String args[]) {
Scanner sc = new Scanner (System.in);
System.out.println("Available options are: ");
System.out.println("1. Book Ticket");
System.out.println("2. Cancel Ticket");
System.out.println("3. Check Status");
System.out.println("4. Exit");
int a = -1;
int seat_availability = 30;
int option;
do{
System.out.println();
System.out.print("Enter your option(only number): ");
option = sc.nextInt();
switch (option) {
case 1:
System.out.print("Enter number of seats needed: ");
int seats = sc.nextInt();
if (seat_availability >= seats) {
if (seats > 0) {
System.out.println("Your ticket is booked for " +seats+ " seats.");
a = 1;
} else {
System.out.println("You should book atleast 1 seat. So your ticket is not booked.");
a = 0;
}
} else {
System.out.println("No seats are available.");
}
break;
case 2:
if (a == 1) {
seats = 0;
System.out.println("Your ticket is cancelled.");
a = 0;
} else {
System.out.println("No ticket is booked.");
}
break;
case 3:
if (a == 1) {
System.out.println("Ticket is Booked.");
} else if (a == 0) {
System.out.println("Your ticket is cancelled. So no ticket is booked.");
} else {
System.out.println("No ticket is booked. So not possible for cancellation.");
}
break;
case 4:
System.out.println("Exit");
break;
default:
System.out.println("You entered invalid option. Try again!");
}
}
while (option != 4);
}
}
