package ru.sbrf.lesson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    private Calc calc = new Calc();

    @Test
    public void add() {
        assertEquals(10, calc.add(4, 6));
    }

    @Test
    public void substr() {
        assertEquals(5, calc.substraction(7, 2));
    }

    @Test
    public void multiplication() {
        assertEquals(6, calc.multiplication(3, 2));
    }

    @Test
    public void division() {
        assertEquals(2, calc.division(8, 4));
    }
}