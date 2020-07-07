package finaldemo.java.oop;

class A {
    final int i; // constant
    public A() {
        i = 10; //
    }

//    Cannot override this method
    public final void show()
    {
        System.out.println("in A");
    }
}

// Cannot extend
final class B {
    public void show()
    {
        System.out.println("in Show");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.i);

        B obj2 = new B();
        obj2.show();
    }
}
