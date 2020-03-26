package ru.sbrf.lesson;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomethingTest {

    private Something something = new Something();

    @Test
    public void shortSum() {
       // assertEquals(something.shortSum(1,2),3);
    }

    @Test
    public void longSum() {
        assertEquals(something.longSum(1,2),3);
    }

    @Test
    public void getMaxNumber() {
        assertEquals(something.getMaxNumber(5,7),7);
    }

    @Test
    public void isCharA() {
        assertTrue(something.isCharA('A'));
        assertFalse(something.isCharA('B'));
    }

    @Test
    public void isCharNumber() {
        for(int i = 0; i < 10; i++){
            assertTrue(something.isCharNumber((char)i));
        }
        assertFalse(something.isCharNumber('A'));
    }

    @Test
    public void checkZeroDivision() {
        something.checkZeroDivision(1);
    }

    @Test
    public void printBinaryInt() {
        something.printBinaryInt();
    }

    @Test
    public void printBinaryMaxMin() {
        something.printBinaryMaxMin();
    }

    @Test
    public void charToInt() {
        System.out.println(something.charToInt('1'));
    }

    @Test
    public void intOtChar() {
        System.out.println(something.intToChar(5).toString());
    }
}