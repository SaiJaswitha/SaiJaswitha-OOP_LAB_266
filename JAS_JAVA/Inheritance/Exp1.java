class Person {
String name;
}
class Student extends Person {
int stuID;
String course;
void display() {
System.out.println("Name: "+name);
System.out.println("Student ID: "+stuID);
System.out.println("Course: "+course);
}
}
public class Exp1 {
public static void main(String args[]) {
Student s = new Student();
s.name="vdcs";
s.stuID=678;
s.course="ghj";
s.display();
}
}