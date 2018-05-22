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
                {0, new int[]{1}, 1, true},
                {0, new int[]{9}, 1, false},
                {0, new int[]{}, 0, true},
                {0, new int[]{3, 2, 4, 6}, 8, true},
                {0, new int[]{6, 2, 4, 3}, 8, true},
                {0, new int[]{5, 2, 4, 6}, 9, false},
                {0, new int[]{6, 2, 4, 5}, 9, false},
                {0, new int[]{3, 2, 4, 6}, 3, false},
                {0, new int[]{1, 6, 2, 6, 4}, 12, true},
                {0, new int[]{1, 6, 2, 6, 4}, 13, true},
                {0, new int[]{1, 6, 2, 6, 4}, 4, false},
                {0, new int[]{1, 6, 2, 6, 4}, 9, false},
                {0, new int[]{1, 6, 2, 6, 5}, 14, true},
                {0, new int[]{1, 6, 2, 6, 5}, 15, true},
                {0, new int[]{1, 6, 2, 6, 5}, 16, false},
        };
    }

    @Test(dataProvider = "groupSum6Data")
    public void shouldSolveSum6(int start, int[] nums, int target, boolean exptdResponse) {
        assertEquals(recursion2.groupSum6(start, nums, target), exptdResponse);
    }

    @DataProvider
    private static Object[][] groupNoAdjData() {
        return new Object[][]{
                {0, new int[]{2, 5, 10, 4}, 12, true},
                {0, new int[]{2, 5, 10, 4}, 14, false},
                {0, new int[]{2, 5, 10, 4}, 7, false},
                {0, new int[]{2, 5, 10, 4, 2}, 7, true},
                {0, new int[]{2, 5, 10, 4}, 9, true},
                {0, new int[]{10, 2, 2, 3, 3}, 15, true},
                {0, new int[]{10, 2, 2, 3, 3}, 7, false},
                {0, new int[]{}, 0, true},
                {0, new int[]{1}, 1, true},
                {0, new int[]{9}, 1, false},
                {0, new int[]{9}, 0, true},
                {0, new int[]{5, 10, 4, 1}, 11, true},
        };
    }

    @Test(dataProvider = "groupNoAdjData")
    public void shouldSolveSumNoAdj(int start, int[] nums, int target, boolean exptdResponse) {
        assertEquals(recursion2.groupNoAdj(start, nums, target), exptdResponse);
    }

    @DataProvider
    private static Object[][] groupSum5Data() {
        return new Object[][]{
                {0, new int[]{2, 5, 10, 4}, 19, true},
                {0, new int[]{2, 5, 10, 4}, 17, true},
                {0, new int[]{2, 5, 10, 4}, 12, false},
                {0, new int[]{2, 5, 4, 10}, 12, false},
                {0, new int[]{3, 5, 1}, 4, false},
                {0, new int[]{3, 5, 1}, 5, true},
                {0, new int[]{1, 3, 5}, 5, true},
                {0, new int[]{3, 5, 1}, 9, false},
                {0, new int[]{2, 5, 10, 4}, 7, false},
                {0, new int[]{2, 5, 10, 4}, 15, true},
                {0, new int[]{2, 5, 10, 4}, 11, false},
                {0, new int[]{1}, 1, true},
                {0, new int[]{9}, 1, false},
                {0, new int[]{9}, 0, true},
                {0, new int[]{}, 0, true},
        };
    }

    @Test(dataProvider = "groupSum5Data")
    public void shouldSolveSum5(int start, int[] nums, int target, boolean exptdResponse) {
        assertEquals(recursion2.groupSum5(start, nums, target), exptdResponse);
    }

    @DataProvider
    private static Object[][] groupSumClumpData() {
        return new Object[][]{
                {0, new int[]{2, 4, 8}, 10, true},
                {0, new int[]{1, 2, 4, 8, 1}, 14, true},
                {0, new int[]{2, 4, 4, 8}, 14, false},
                {0, new int[]{8, 2, 2, 1}, 9, true},
                {0, new int[]{8, 2, 2, 1}, 11, false},
                {0, new int[]{1}, 1, true},
                {0, new int[]{9}, 1, false},
        };
    }

    @Test(dataProvider = "groupSumClumpData")
    public void shouldSolveSumClump(int start, int[] nums, int target, boolean exptdResponse) {
        assertEquals(recursion2.groupSumClump(start, nums, target), exptdResponse);
    }

    @DataProvider
    private static Object[][] splitArrayData() {
        return new Object[][]{
                {new int[]{2, 2}, true},
                {new int[]{2, 3}, false},
                {new int[]{5, 2, 3}, true},
                {new int[]{5, 2, 2}, false},
                {new int[]{1, 1, 1, 1, 1, 1}, true},
                {new int[]{1, 1, 1, 1, 1}, false},
                {new int[]{}, true},
                {new int[]{1}, false},
                {new int[]{3, 5}, false},
                {new int[]{5, 3, 2}, true},
                {new int[]{2, 2, 10, 10, 1, 1}, true},
                {new int[]{1, 2, 2, 10, 10, 1, 1}, false},
                {new int[]{1, 2, 3, 10, 10, 1, 1}, true},
        };
    }

    @Test(dataProvider = "splitArrayData")
    public void shouldCheckArraySplittingPossibility(int[] nums, boolean exptdResponse) {
        assertEquals(recursion2.splitArray(nums), exptdResponse);
    }
}