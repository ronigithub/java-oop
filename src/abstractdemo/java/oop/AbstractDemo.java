package abstractdemo.java.oop;

public class AbstractDemo {
    public static void main(String[] args) {

        Human obj = new Man();
        obj.eat();

        System.out.println("===================");
        System.out.println("Printer Section");
        System.out.println("===================");
        Printer printerObj = new Printer();
        printerObj.show(5.5);
    }
}
