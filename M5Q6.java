//6. Create a class Student with attributes roll no, name, age and course. Initialize values  
//through parameterized constructor. If age of student is not in between 15 and 41 then  
//generate user-defined exception "AgeNotWithinRangeException". If name contains 
//numbers  or special symbols raise exception "NameNotValidException". Define the two 
//exception  classes.  

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 40) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 40");
        }
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name should contain only alphabets and spaces");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John Doe", 20, "Computer Science");
            student1.displayInfo();
            
            // Testing custom exceptions
            Student student2 = new Student(2, "Alice123", 25, "Mathematics"); // Should throw NameNotValidException
            Student student3 = new Student(3, "Bob", 10, "Physics"); // Should throw AgeNotWithinRangeException
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
