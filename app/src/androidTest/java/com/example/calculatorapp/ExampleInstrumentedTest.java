package com.example.calculatorapp;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void testGetResultValidExpression() {
        MainActivity mainActivity = new MainActivity();
        String result = mainActivity.getResult("2+2");
        assertEquals("4", result);
    } /* Checks if the method correctly evaluates a valid expression (2+2) and returns the expected result.*/

    @Test
    public void testGetResultInvalidExpression() {
        MainActivity mainActivity = new MainActivity();
        String result = mainActivity.getResult("invalidExpression");
        assertEquals("Error", result);
        /*Checks if the method returns "Error" for an invalid expression.*/


    }
}
