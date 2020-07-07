package oop.java.interfacedemo;

interface Writer {
// By default, all method of interface has public abstract keyword
    void writer();
}

class Pen implements Writer {
    public void writer()
    {
        System.out.println("I'm a Pen");
    }
}

class Pencil implements Writer {
    public void writer()
    {
        System.out.println("I'm a Pencil");
    }
}

class Kit {
    public void doSomething(Writer p)
    {
        p.writer();
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        Kit k = new Kit();

        Writer p = new Pen();

        Writer pc = new Pencil();

        k.doSomething(p);
    }
}
