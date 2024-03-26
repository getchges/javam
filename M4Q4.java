//4. Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named  
//'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This I rectangular shape" and 
//"This  is circular shape" respectively. Create a subclass 'Square' of 'Rectangle having a method to print "Square 
//is a  rectangle". Now call the method of 'Shape' and 'Rectangle' clas by the object of 'Square' class. 

class Shape {
    public void printShape() {
        System.out.println("This is shape.");
    }
}

class Rectangle extends Shape {
    public void printShape() {
        System.out.println("This is rectangular shape.");
    }
}

class Circle extends Shape {
    public void printShape() {
        System.out.println("This is circular shape.");
    }
}

class Square extends Rectangle {
    public void printShape() {
        System.out.println("Square is a rectangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();  // This will call the method of 'Square' class
        square.super.printShape(); // This will call the method of 'Rectangle' class
        ((Shape)square).printShape(); // This will call the method of 'Shape' class
    }
}
