package ru.sbrf.lesson;

public class Main {
    private int a = 5;
    private int b = 6;
    private int result = 0;
    public static void main(String[] args) {
        System.out.println("Hello");
        Something something = new Something();
        something.printBinaryMaxMin();
        //something.checkZeroDivision(1);
        Short s = (short) 32767;
        Byte b = (byte) 10;
        System.out.println(something.shortSum(b,s));
    }

    public int calc() {
        result = a + b;

        return result;
    }
}
