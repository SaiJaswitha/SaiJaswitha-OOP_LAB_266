class FoodItem {
String itemName;
float price;
public FoodItem (String name,float pr) {
itemName = name;
price = pr;
}
public void displayFoodDetails() {
System.out.println("Food Item: "+itemName);
System.out.println("Price :"+price);
}
}
class VegItem extends FoodItem {
String category;
public VegItem (String name, float pr, String cat) {
super(name,pr);
category = cat;
}
public void VegItemDetails() {
displayFoodDetails();
System.out.println("Category: "+category);
}
}
class NonVegItem extends FoodItem {
int spiceLevel;
public NonVegItem(String name, float pr, int slevel) {
super(name, pr);
spiceLevel = slevel;
}
public void NonVegItemDetails() {
displayFoodDetails();
System.out.println("Spice Level: "+spiceLevel);
}
}
class Restaurant {
String resName;
public Restaurant (String rest) {
resName = rest;
}
public void displayRest() {
System.out.println("Restaurant name: "+resName);
}
}
public class main3 {
public static void main (String args[]) {
Restaurant r1 = new Restaurant("A2B");
r1.displayRest();
VegItem v = new VegItem("Idly",120,"South Indian");
v.VegItemDetails();
Restaurant r2 = new Restaurant("Paradise");
r2.displayRest();
NonVegItem n = new NonVegItem("Chicken Biryani", 250, 4);
n.NonVegItemDetails();
}
}