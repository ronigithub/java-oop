package object.java.oop;

class Calc {
    int num1;
    int num2;
    int result;

    void perform()
    {
        result = num1 + num2;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Calc obj = new Calc();

        obj.num1 = 5;
        obj.num2 = 2;

        obj.perform();

        System.out.println(obj.result);
    }
}
