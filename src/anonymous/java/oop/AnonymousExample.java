package anonymous.java.oop;

class A {
    public void show()
    {
        System.out.println("in A show");
    }
}

public class AnonymousExample {
    public static void main(String[] args) {

        //  Anonymous class does have name, it can't reuse.
        //  When we need only overwrite a method then we can use it
        A obj = new A() {
            public void show()
            {
                System.out.println("I'm the best.");
            }
        };

        obj.show();
    }
}
