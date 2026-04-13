class Guest {     //class
    public void read() {   //method
        System.out.println("Read Code");   
    }
}

class Developer extends Guest{   //Inherit parent into child
    public void write() {    //Method
        System.out.println("Write Code");
        read();
}
    public void read() {   //method
        System.out.println("Other Read Code"); 
    }
    
}

class Admin extends Developer {   //Inherit Developer in Admin
    public void manage() {     //Method
        System.out.println("Manage Code");
    }    
}


public class User {
    public static void main(String args[]) {
        /*In this User class using main method we can access all three methods Guest(), Developer(), Admin() by creating objects */
        Guest guest = new Guest();  //object creation for Guest() here object is guest
        guest.read();   //accessing read() method from Guest() using guest object

        Developer dev = new Developer();  //object creation for Developer() here object is dev
        dev.read();
        dev.write();

        Admin admin = new Admin();   //object creation for Admin() here object is admin
        admin.read();
        admin.write();
        admin.manage();
    }
    
}
