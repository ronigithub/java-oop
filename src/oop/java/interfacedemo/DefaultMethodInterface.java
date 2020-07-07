package oop.java.interfacedemo;

interface Demo {
    void abc();
//  default keyword resolves the problem of defining method
//  It also can be override
    default void show()
    {
        System.out.println("in show");
    }
}

class DemoImp implements Demo {
    @Override
    public void abc() {
        System.out.println("in abc");
    }
}

public class DefaultMethodInterface {
    public static void main(String[] args) {
        DemoImp obj = new DemoImp();

        obj.abc();
        obj.show();
    }
}
