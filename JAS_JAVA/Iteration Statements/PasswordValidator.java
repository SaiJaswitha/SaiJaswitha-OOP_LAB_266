import java.util.*;
public class PasswordValidator {
public static void main (String args[]) {
Scanner sc = new Scanner (System.in);
int a=0, b=0, c=0, d=0;
System.out.println("Password must contain:");
System.out.println("1. at least 8 characters");
System.out.println("2. a lowercase character");
System.out.println("3. a uppercase character");
System.out.println("4. a digit");
System.out.println("5. a special character");
System.out.println();
System.out.print("Enter Password: ");
String pas = sc.nextLine();
for (int i = 0; i < pas.length(); i++) {
if (pas.length() < 8) {
System.out.println("Password must be atleast 8 characters");
System.out.println("Re-enter password with satisfying all conditions");
break;
} 
char ch = pas.charAt(i);
if (Character.isLowerCase(ch)) {
a = 1;
} else if (Character.isUpperCase(ch)) {
b = 1;
} else if (Character.isDigit(ch)) {
c = 1;
} else {
d = 1;
}
}
if (a==1 && b==1 && c==1 && d==1) {
System.out.println("Valid Password");
} else {
System.out.println("Your Password is not valid");
}
}
}