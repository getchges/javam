//5. Create a class with a method that prints "This is parent class" and its subclass with another method that prints  
//"This is child class". Now, create an object for each of the class and call ● method of parent class by object of  
//parent class ● method of child class by object of child class ● method of parent class by object of child class  

class Parent {
    public void parentMethod() {
        System.out.println("This is parent class.");
    }
}

class Child extends Parent {
    public void childMethod() {
        System.out.println("This is child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Parent class
        Parent parentObj = new Parent();
        parentObj.parentMethod(); // Calling method of parent class by object of parent class

        // Creating an object of Child class
        Child childObj = new Child();
        childObj.childMethod(); // Calling method of child class by object of child class

        // Calling method of parent class by object of child class
        childObj.parentMethod();
    }
}
