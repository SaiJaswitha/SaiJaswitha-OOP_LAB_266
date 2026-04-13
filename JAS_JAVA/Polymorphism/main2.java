public class main2 {
public int calc(int a, int b) {
return(a+b);
}
public int calc(int a, int b, int c) {
return(a*b*c);
}
public static void main(String args[]) {
main2 obj = new main2();
System.out.println(obj.calc(6,3,8));
System.out.println(obj.calc(2,9));
}
}