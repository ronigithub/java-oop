package oop.java.abstractdemo;

class Printer {
    public void show(Number i)
    {
        System.out.println(i);
    }
}

public class AbstractDemo2 {
    public static void main(String[] args) {
        Printer printerObj = new Printer();
        printerObj.show(5.5);
    }
}
