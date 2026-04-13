class Employee {

    Employee() {
        System.out.println("Employee system");
    }

}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(double salary) {

        super();
        System.out.println("Full Time Employee Salary: " + salary);

    }

}

class PartTimeEmployee extends Employee {

    PartTimeEmployee(double hours, double rate) {

        super();
        double salary = hours * rate;
        System.out.println("Part Time Employee Salary: " + salary);

    }

}

class ContractEmployee extends Employee {

    ContractEmployee(double contractAmount) {

        super();
        System.out.println("Contract Employee Salary: " + contractAmount);

    }

}

public class Exp4 {

    public static void main(String args[]) {

        FullTimeEmployee f = new FullTimeEmployee(50000);

        PartTimeEmployee p = new PartTimeEmployee(20, 500);

        ContractEmployee c = new ContractEmployee(30000);

    }

}