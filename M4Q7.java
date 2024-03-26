//7. Design a vehicle class hierarchy in Java and develop a program to demonstrate Polymorphism.

// Vehicle class (Parent class)
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

// Car class (Child class)
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving");
    }
}

// Motorcycle class (Child class)
class Motorcycle extends Vehicle {
    @Override
    void move() {
        System.out.println("Motorcycle is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of different types of vehicles
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Car();
        Vehicle vehicle3 = new Motorcycle();

        // Demonstrating polymorphism
        vehicle1.move(); // Calls move() method of Vehicle class
        vehicle2.move(); // Calls move() method of Car class
        vehicle3.move(); // Calls move() method of Motorcycle class
    }
}
