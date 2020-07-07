package oop.java.varargs;

class Calc {
    public int add(int ... n) // array {4, 5, 6, 7, 8}
    {
        int sum = 0;
        for (int i : n)
        {
            sum += i;
        }

        return sum;
    }
}

public class VarargsDemo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(4, 5, 6, 7, 8));
    }
}
