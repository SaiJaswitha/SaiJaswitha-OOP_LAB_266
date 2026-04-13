class Employee {
String name;
Employee(String name) {
this.name = name;
}
void calculateSalary() {
System.out.println("Calculating salary...");
}
}
class FullTimeEmployee extends Employee {
double monthlySalary;
FullTimeEmployee(String name, double salary) {
super(name);
this.monthlySalary = salary;
}
void calculateSalary() {
System.out.println("Full Time Employee: " + name);
System.out.println("Salary: " + monthlySalary);
}
}
class PartTimeEmployee extends Employee {
int hours;
double rate;
PartTimeEmployee(String name, int hours, double rate) {
super(name);
this.hours = hours;
this.rate = rate;
}
void calculateSalary() {
double salary = hours * rate;
System.out.println("Part Time Employee: " + name);
System.out.println("Salary: " + salary);
}
}
class ContractEmployee extends Employee {
double contractAmount;
ContractEmployee(String name, double amount) {
super(name);
this.contractAmount = amount;
}
void calculateSalary() {
System.out.println("Contract Employee: " + name);
System.out.println("Salary: " + contractAmount);
}
}
public class main6 {
public static void main(String args[]) {
Employee e1 = new FullTimeEmployee("Jassu", 50000);
Employee e2 = new PartTimeEmployee("Ravi", 20, 200);
Employee e3 = new ContractEmployee("Veer", 80000);
e1.calculateSalary();
System.out.println("------");
e2.calculateSalary();
System.out.println("------");
e3.calculateSalary();
}
}