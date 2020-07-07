package oop.java.constructor;

class Calculator {
    int num1;
    int num2;

    public Calculator() {
        num1 = 5;
        num2 = 6;
        System.out.println("in Constructor");
    }

    public Calculator(int n) {
        num1 = n;
        num2 = n;
    }

    public Calculator(double d, int n) {
        num1 = (int) d;
        num2 = n;
    }

}

public class ConstructorDemo {
    public static void main(String[] args) {

        Calculator obj = new Calculator(4); // Constructor

        System.out.println(obj.num1);

    }
}
