class FoodItem {
String itemName;
float price;
public void setFoodItem(String name, float p) {
itemName = name;
price = p;
}
public void displayFoodItem() {
System.out.println("Item: " + itemName);
System.out.println("Price: " + price);
}
}
class VegItem extends FoodItem {
String category;
public void setVegItem(String cat) {
category = cat;
}
public void showVegItem() {
displayFoodItem(); // inherited
System.out.println("Category: " + category);
}
}
class NonVegItem extends FoodItem {
int spiceLevel;
public void setNonVegItem(int spice) {
spiceLevel = spice;
}
public void showNonVegItem() {
displayFoodItem(); // inherited
System.out.println("Spice Level: " + spiceLevel);
}
}
class Restaurant {
String restaurantName;
public void setRestaurant(String name) {
restaurantName = name;
}
public void displayRestaurant() {
System.out.println("Restaurant: " + restaurantName);
}
}
public class main2 {
public static void main(String args[]) {
// Veg item
Restaurant r1 = new Restaurant();
r1.setRestaurant("A2B");
VegItem v = new VegItem();
v.setFoodItem("Idli", 40);
v.setVegItem("South Indian");
r1.displayRestaurant();
v.showVegItem();
System.out.println("------");
// Non-veg item
Restaurant r2 = new Restaurant();
r2.setRestaurant("Buhari");
NonVegItem nv = new NonVegItem();
nv.setFoodItem("Chicken Biryani", 180);
nv.setNonVegItem(5);
r2.displayRestaurant();
nv.showNonVegItem();
}
}