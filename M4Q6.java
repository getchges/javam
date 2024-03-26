//6. Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class  
//smart telephone and demonstrate polymorphism   

abstract class Telephone {
    abstract void dial();
    abstract void lift();
    abstract void disconnected();
}

class SmartTelephone extends Telephone {
    @Override
    void dial() {
        System.out.println("SmartTelephone: Dialing a number...");
    }

    @Override
    void lift() {
        System.out.println("SmartTelephone: Lifting the receiver...");
    }

    @Override
    void disconnected() {
        System.out.println("SmartTelephone: Call disconnected.");
    }
}

public class Main {
    public static void main(String[] args) {
        Telephone phone = new SmartTelephone(); // Polymorphism: Base class reference to a derived class object
        phone.dial();         // Calls dial() method of SmartTelephone
        phone.lift();         // Calls lift() method of SmartTelephone
        phone.disconnected(); // Calls disconnected() method of SmartTelephone
    }
}
