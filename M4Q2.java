//2. A class Shape is defined with two overloading constructors in it. Another class Test1 is partially defined which  
//inherits the class Shape. The class Test1 should include two overloading constructors as appropriate for 
//some  object instantiation. You should define the constructors using the super class constructors. Also, 
//override the  method calculate () in Test1 to calculate the volume of a Shape.   

class Shape {
    double length;
    double width;
    double height;

    Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    Shape(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

class Test1 extends Shape {
    Test1(double length, double width) {
        super(length, width);
    }

    Test1(double length, double width, double height) {
        super(length, width, height);
    }

    @Override
    public double calculate() {
        // Calculate volume based on the shape type
        if (height != 0) { // For a 3D shape
            return length * width * height;
        } else { // For a 2D shape
            return length * width;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Test1 obj1 = new Test1(5, 3); // Creating a 2D shape
        Test1 obj2 = new Test1(4, 3, 2); // Creating a 3D shape

        System.out.println("Volume of obj1: " + obj1.calculate());
        System.out.println("Volume of obj2: " + obj2.calculate());
    }
}
