class Animal {
void makesound() {
System.out.println("Make Sound");
}
Animal () {
makesound();
}
}
class Dog extends Animal {
Dog() {
super();
System.out.println("Dog Barks");
}
}
public class Exp3 {
public static void main(String args[]) {
Animal a;
a = new Dog();
}
}