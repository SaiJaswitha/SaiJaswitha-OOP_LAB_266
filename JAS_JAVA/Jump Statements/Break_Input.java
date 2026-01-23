import java.util.*;
public class Break_Input {
public static void main (String args[]) {
Scanner sc = new Scanner (System.in);
while (true) {
System.out.print("Enter a number (-1 to exit): ");
int num = sc.nextInt();
if (num == -1) {
System.out.println("Exit");
break;
} else {
continue;
}
}
}
}