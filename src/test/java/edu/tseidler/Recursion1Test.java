package edu.tseidler;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Recursion1Test {
    Recursion1 recursion1 = new Recursion1();

    @DataProvider
    private static Object[][] factorialData() {
        return new Object[][] {
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},
                {7, 5040},
                {8, 40320},
                {12, 479001600},
        };
    }

    @Test(dataProvider = "factorialData")
    public void shouldComputeFactorial(int inp, int exptd) {
        assertEquals(recursion1.factorial(inp), exptd);
    }
}