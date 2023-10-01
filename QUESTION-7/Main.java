//Q : 7
// AUTHOR: Argha Digar
// TITLE: Multiple Inheritance Through Interfaces
// DESCRIPTION: This Java program demonstrates multiple inheritance through interfaces. It defines two interfaces (Interface1 and Interface2) with methods and implements both interfaces in a class called MyClass, which inherits from both interfaces and provides its own methods.


// Define the first interface
interface Interface1 {
    void method1();
}

// Define the second interface
interface Interface2 {
    void method2();
}

// Implement both interfaces in a class
class MyClass implements Interface1, Interface2 {

    public void method1() {
        System.out.println("Method 1 from Interface1");
    }


    public void method2() {
        System.out.println("Method 2 from Interface2");
    }

    // Additional methods specific to MyClass
    void myMethod() {
        System.out.println("MyClass-specific method");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1(); // Call method from Interface1
        obj.method2(); // Call method from Interface2
        obj.myMethod(); // Call method specific to MyClass
    }
}
