package ru.sbrf.lesson;

public class Calc {
    private int result;
    public int add(int a, int b){
        result = a+b;
        return result;
    }
    public int substraction(int a, int b){
        result = a-b;
        return result;
    }
    public int multiplication(int a, int b){
        result = a*b;
        return result;
    }
    public int division(int a, int b){
        result = a/b;
        return result;
    }
}
