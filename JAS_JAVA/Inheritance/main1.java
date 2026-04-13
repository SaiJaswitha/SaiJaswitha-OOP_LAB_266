class Product {
String name;
float price;
public void display(String na,int pr) {
name = na;
price = pr;
System.out.println("Name: "+name);
System.out.println("Price: "+price);
}
}
class Electronics extends Product {
int warranty;
public void showElectronicsDetails(int warr) {
warranty = warr;
System.out.println("Warranty of the device: "+warranty+" years");
}
}
class Clothing extends Product {
float size;
public void showClothingDetails(float s) {
size = s;
System.out.println("Cloth size: "+size);
}
}
public class main1 {
public static void main(String args []) {
Electronics E = new Electronics();
Clothing C = new Clothing();
E.display("Mobile",75000);
E.showElectronicsDetails(3);
C.display("Cotton",500);
C.showClothingDetails(80);
}
}
