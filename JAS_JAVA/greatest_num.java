//Taking input using for loop
import java.util.*;
public class greatest_num{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] num = new int[4];
for (int i=1; i<=3; i++){
System.out.print("Enter number "+i+": ");
num[i] = sc.nextInt();
}
if (num[1]>num[2] && num[1]>num[3]){
System.out.println("Greatest number is "+num[1]);
} else if(num[2]>num[1] && num[2]>num[3]){
System.out.println("Greatest number is "+num[2]);
} else {
System.out.println("Greatest number is "+num[3]);
}
}
}