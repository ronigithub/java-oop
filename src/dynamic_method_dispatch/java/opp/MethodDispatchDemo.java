package dynamic_method_dispatch.java.opp;

class A {
    public void show()
    {
        System.out.println("in A");
    }
}

class B extends A {
    @Override
    public void show() {
//        super.show();
        System.out.println("in B");
    }
}

class C extends A {
    @Override
    public void show() {
//        super.show();
        System.out.println("in C");
    }
}

public class MethodDispatchDemo {
//    compile time and runtime
    public static void main(String[] args) {

        A obj = new B(); // runtime polymorphism
        obj.show();

        obj = new C();
        obj.show(); // Dynamic Method Dispatch

    }
}
