import java.util.*;
public class DataOperations3{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("Enter a number: ");
int x = sc.nextInt();
x += 5;  
System.out.println("After x+=5 : " +x);
x *= 4;  
System.out.println("After x*=4 : " +x);
x -= 3;
System.out.println("After x-=3 : " +x);
x /= 2;  
System.out.println("After x/=2 : " +x);
x %= 6;
System.out.println("After x%=6 : " +x);
}
}