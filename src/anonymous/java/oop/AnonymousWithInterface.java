package anonymous.java.oop;

interface Abc {
    void show();
}

public class AnonymousWithInterface {
    public static void main(String[] args) {

        // Create object of interface using anonymous class
        Abc inObj = new Abc() {
            @Override
            public void show() {
                System.out.println("I'm the best");
            }
        };
        inObj.show();

    }
}
