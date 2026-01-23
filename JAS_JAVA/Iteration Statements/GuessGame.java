import java.util.*;
public class GuessGame {
public static void main (String args[]) {
Scanner sc = new Scanner (System.in);
int num = 3;
int guess;
do {
System.out.print ("Enter your guess number: ");
guess = sc.nextInt();
} while (num != guess);
System.out.println("Correct Guess!");
}
}