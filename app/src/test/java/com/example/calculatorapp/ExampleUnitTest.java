package com.example.calculatorapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testAddition() {
        MainActivity activity = new MainActivity();
        String result = activity.getResult("2 + 3");
        assertEquals("5", result);
    }

    @Test
    public void testSubtraction() {
        MainActivity activity = new MainActivity();
        String result = activity.getResult("8 - 5");
        assertEquals("3", result);
    }

    @Test
    public void testMultiplication() {
        MainActivity activity = new MainActivity();
        String result = activity.getResult("2 * 6");
        assertEquals("12", result);
    }

    @Test
    public void testDivision() {
        MainActivity activity = new MainActivity();
        String result = activity.getResult("10 / 2");
        assertEquals("5", result);
    }
}
