class Person {
private String name;
private int age;
public String getName() {
return name;
}
public void setName(String n) {
name = n;
}
public int getAge() {
return age;
}
public void setAge(int a) {
if (a > 0) {
age = a;
} else {
System.out.println("Invalid age");
}
}
}
public class main1 {
public static void main(String args[]) {
Person p = new Person();
p.setName("Jassu");
p.setAge(20);
System.out.println("Name: " + p.getName());
System.out.println("Age: " + p.getAge());
}
}