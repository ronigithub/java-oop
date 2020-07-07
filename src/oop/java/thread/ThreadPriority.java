package oop.java.thread;

public class ThreadPriority {
    public static void main(String[] args) throws Exception
    {
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        }, "Hi Thread"); // Set Thread name after comma

        Thread t2 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        }, "Hello Thread"); // Set Thread name after comma

//        Set name of thread (Alternative)
//        t1.setName("Hi Thread");
//        t2.setName("Hello Thread");

//        Get name of Thread
//        System.out.println(t1.getName());
//        System.out.println(t2.getName());

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try { Thread.sleep(10); } catch (Exception e) {}
        t2.start();

        System.out.println(t1.isAlive());

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());

        System.out.println("Bye");
    }
}
