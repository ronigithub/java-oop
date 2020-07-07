package abstractdemo.java.oop;

abstract class Writer {
    public abstract void writer();

    public void show()
    {
        System.out.println("in Writer");
    }
}

class Pen extends Writer {
    public void writer()
    {
        System.out.println("I'm a Pen");
    }
}

class Pencil extends Writer {
    public void writer()
    {
        System.out.println("I'm a Pencil");
    }
}

class Kit {
    public void doSomething(Writer p)
    {
        p.writer();
//        p.show();
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Kit k = new Kit();

        Writer p = new Pen();

        Writer pc = new Pencil();

        k.doSomething(p);
    }
}
