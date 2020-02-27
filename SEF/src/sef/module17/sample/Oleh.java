package sef.module17.sample;

public class Oleh {
    public static void main(String arg[]) {
        Oleh oleh = new Oleh();
        oleh.add(3,5);
        System.out.println("Hello : " +  oleh.add(3,5) );
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
