package edu.tseidler;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Recursion2Test {
    private Recursion2 recursion2 = new Recursion2();

    @DataProvider
    private static Object[][] groupSumData() {
        return new Object[][]{
                {0, new int[]{2, 4, 8}, 10, true},
                {0, new int[]{2, 4, 8}, 14, true},
                {0, new int[]{2, 4, 8}, 9, false},
                {0, new int[]{2, 4, 8}, 8, true},
                {1, new int[]{2, 4, 8}, 8, true},
                {1, new int[]{2, 4, 8}, 2, false},
                {0, new int[]{1}, 1, true},
                {0, new int[]{9}, 1, false},
                {1, new int[]{9}, 0, true},
                {0, new int[]{}, 0, true},
                {0, new int[]{10, 2, 2, 5}, 17, true},
                {0, new int[]{10, 2, 2, 5}, 15, true},
                {0, new int[]{10, 2, 2, 5}, 9, true},
        };
    }

    @Test(dataProvider = "groupSumData")
    public void shouldDecideOnGroupingSum(int start, int[] nums, int target, boolean exptdResponse) {
        assertEquals(recursion2.groupSum(start, nums, target), exptdResponse);
    }

    @DataProvider
    private static Object[][] groupSum6Data() {
        return new Object[][]{
                {0, new int[]{5, 6, 2}, 8, true},
                {0, new int[]{5, 6, 2}, 9, false},
                {0, new int[]{5, 6, 2}, 7, false},
        };
    }

    @Test(dataProvider = "groupSum6Data")
    public void shouldSolveSum6(int start, int[] nums, int target, boolean exptdResponse) {
//        assertEquals(recursion2.groupSum6(start, nums, target), exptdResponse);
    }
}