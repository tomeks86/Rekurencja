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
    public void shouldComputeFactorial(int number, int exptd) {
        assertEquals(recursion1.factorial(number), exptd);
    }

    @DataProvider
    private static Object[][] bunnyEarsData() {
        return new Object[][] {
                {0, 0},
                {1, 2},
                {2, 4},
                {3, 6},
                {4, 8},
                {5, 10},
                {12, 24},
                {50, 100},
                {234, 468},
        };
    }

    @Test(dataProvider = "bunnyEarsData")
    public void shouldComputeBunnyEars(int bunnies, int exptd) {
        assertEquals(recursion1.bunnyEars(bunnies), exptd);
    }
}