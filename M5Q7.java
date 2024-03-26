//7. Program to throw a user defined exception for employee details ● If an employee name 
//is  a number, a name exception must be thrown. ● If an employee age is greater than 50, 
//an  age exception must be thrown   

class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) throws NameException, AgeException {
        if (name.matches("[0-9]+")) {
            throw new NameException("Employee name cannot be a number");
        }
        if (age > 50) {
            throw new AgeException("Employee age cannot be greater than 50");
        }

        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("John Doe", 30);
            emp1.displayInfo();
            
            // Testing custom exceptions
            Employee emp2 = new Employee("12345", 25); // Should throw NameException
            Employee emp3 = new Employee("Alice", 55); // Should throw AgeException
        } catch (NameException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
