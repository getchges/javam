//3. Create a class named 'Member' having the following members: Name, Age, Phone number, Address, Salary. It  
//also has a method named 'printSalary' which prints the salary of the members. Two classes 'Employee' and  
//'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 
//'specialization'  and 'department' respectively. Now, assign name, age, phone number, address and salary to 
//an employee and a  manager by making an object of both of these classes and print the same.  

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee();
        emp.name = "John";
        emp.age = 30;
        emp.phoneNumber = "123-456-7890";
        emp.address = "123 Main St";
        emp.salary = 50000.0;
        emp.specialization = "Software Development";

        // Creating a Manager object
        Manager mgr = new Manager();
        mgr.name = "Jane";
        mgr.age = 35;
        mgr.phoneNumber = "987-654-3210";
        mgr.address = "456 Elm St";
        mgr.salary = 80000.0;
        mgr.department = "Human Resources";

        // Printing employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary(); // Using the printSalary method

        System.out.println(); // Blank line for separation

        // Printing manager details
        System.out.println("Manager Details:");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone Number: " + mgr.phoneNumber);
        System.out.println("Address: " + mgr.address);
        mgr.printSalary(); // Using the printSalary method
    }
}
