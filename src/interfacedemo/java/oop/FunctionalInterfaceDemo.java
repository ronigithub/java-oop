package interfacedemo.java.oop;

// Type of interface
// 1. Normal
// 2. Single abstract method - Functional Interface(1.8) - Lambda Expresion
// 3. Marker interface (does not have method)

@FunctionalInterface // not compulsory
interface Abc {
    void show();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Abc obj = () -> System.out.println("I'm the best."); // Lambda Expression, Only achieve which have one method


        obj.show();
    }
}
