package ru.sbrf.lesson;

public class Something {
    public short shortSum(byte p1, short p2) {
        short result = (short) (p1 + p2);
        return result;
    }

    public long longSum(int p1, long p2) {
        long result = p1 + p2;
        return result;
    }

    public int getMaxNumber(int i1, int i2){
        return i1 > i2 ? i1 : i2;
    }

    public boolean isCharA(char c){
        return (c == 'A');
    }

    public boolean isCharNumber(char c){
        switch (c){
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '0':
                return true;
            default:
                return false;

        }
    }
    public int checkZeroDivision(int i){
        return i/0;
    }
    public void printBinaryInt(){
        for (int i = 0; i<=30;i++){
            System.out.println(Integer.toBinaryString(i));
        }
    }
    public void printBinaryMaxMin(){
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE+1));
    }
    public int charToInt(char c){
        return c - '0';
    }

    public char[] intToChar(int i){
        return Character.toChars(i);
    }
}
