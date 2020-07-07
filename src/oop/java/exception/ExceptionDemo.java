package oop.java.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        try
        {
            int a[] = new int[6];
            a[4] = 8;

            int i = 7;
            int j = 0;
            if (j == 0) throw new RoniException("this is custom exception"); // custom exception
            int k = i / j;
            System.out.println("Output is " + k);
        }
        catch (RoniException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}
