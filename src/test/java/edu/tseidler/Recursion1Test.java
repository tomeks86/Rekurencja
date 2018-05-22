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

    @DataProvider
    private static Object[][] fibonacciData() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 1},
                {3, 2},
                {4, 3},
                {5, 5},
                {6, 8},
                {7, 13},
        };
    }

    @Test(dataProvider = "fibonacciData")
    public void shouldComputeFibonacci(int number, int exptd) {
        assertEquals(recursion1.fibonacci(number), exptd);
    }

    @DataProvider
    private static Object[][] bunnyEars2Data() {
        return new Object[][] {
                {0, 0},
                {1, 2},
                {2, 5},
                {3, 7},
                {4, 10},
                {5, 12},
                {6, 15},
                {10, 25},
        };
    }

    @Test(dataProvider = "bunnyEars2Data")
    public void shouldComputeBunnyEars2(int bunnies, int exptd) {
        assertEquals(recursion1.bunnyEars2(bunnies), exptd);
    }

    @DataProvider
    private static Object[][] triangleData() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 3},
                {3, 6},
                {4, 10},
                {5, 15},
                {6, 21},
                {7, 28},
        };
    }

    @Test(dataProvider = "triangleData")
    public void shouldComputeTriangles(int rows, int exptd) {
        assertEquals(recursion1.triangle(rows), exptd);
    }
}