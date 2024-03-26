//10. Develop a program to demonstrate multiple inheritance through interface

// Interface 1
interface Interface1 {
    void method1();
}

// Interface 2
interface Interface2 {
    void method2();
}

// Class implementing both interfaces
class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    public void method2() {
        System.out.println("Method 2 implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
    }
}
