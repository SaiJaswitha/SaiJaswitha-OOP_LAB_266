import java.util.*;
public class Count_num
{
public static void main(String args[])
{
int z = 0;
int p = 0;
int n = 0;
Scanner sc = new Scanner(System.in);
System.out.println("How many numbers you are going to enter? ");
int x = sc.nextInt();
for (int i=1; i<=x; i++){
System.out.print("Enter number "+i+": ");
int num = sc.nextInt();
if (num>0){
p++;
}else if(num<0){
n++;
}else{
z++;
}
}
System.out.println("Total no.of positive numbers: "+p);
System.out.println("Total no.of zeroes: "+z);
System.out.println("Total no.of negative numbers: "+n);
}
}
