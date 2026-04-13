class Course {
String courseName;
int duration;
public Course(String courseName,int duration) {
this.courseName = courseName;
this.duration = duration;
}
public void displayCourse() {
System.out.println("Course Name: "+courseName);
System.out.println("Duration: "+duration);
}
}
class FreeCourse extends Course {
String platform;
public FreeCourse(String courseName,int duration,String platform) {
super(courseName,duration);
this.platform = platform;
}
public void displayFreeCourse() {
displayCourse();
System.out.println("Platform: "+platform);
}
}
class PaidCourse extends Course {
String mentorName;
float price;
public PaidCourse(String courseName,int duration,float price,String mentorName) {
super(courseName, duration);
this.price = price;
this.mentorName = mentorName;
}
public void displayPaidCourse() {
displayCourse();
System.out.println("Price: "+price);
System.out.println("Mentor Name: "+mentorName);
}
}
public class main4 {
public static void main(String args[]) {
FreeCourse f = new FreeCourse("Java",2,"youtube");
f.displayFreeCourse();
PaidCourse p = new PaidCourse("Python",1,3000,"Veer");
p.displayPaidCourse();
}
}