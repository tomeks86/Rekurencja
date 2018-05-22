package edu.tseidler;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Recursion1Test {
    Recursion1 recursion1 = new Recursion1();

    @DataProvider
    private static Object[][] factorialData() {
        return new Object[][]{
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
        return new Object[][]{
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
        return new Object[][]{
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
        return new Object[][]{
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
        return new Object[][]{
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

    @DataProvider
    private static Object[][] sumDigitsData() {
        return new Object[][]{
                {126, 9},
                {49, 13},
                {12, 3},
                {10, 1},
                {1, 1},
                {0, 0},
                {730, 10},
                {1111, 4},
                {11111, 5},
                {10110, 3},
                {235, 10},
        };
    }

    @Test(dataProvider = "sumDigitsData")
    public void shouldComputeSumDigits(int number, int exptd) {
        assertEquals(recursion1.sumDigits(number), exptd);
    }

    @DataProvider
    private static Object[][] count7Data() {
        return new Object[][]{
                {717, 2},
                {7, 1},
                {123, 0},
                {77, 2},
                {7123, 1},
                {771237, 3},
                {771737, 4},
                {47571, 2},
                {777777, 6},
                {70701277, 4},
                {777576197, 5},
                {99999, 0},
                {99799, 1},
        };
    }

    @Test(dataProvider = "count7Data")
    public void shouldCompute7(int number, int exptd) {
        assertEquals(recursion1.count7(number), exptd);
    }

    @DataProvider
    private static Object[][] count8Data() {
        return new Object[][]{
                {8, 1},
                {818, 2},
                {8818, 4},
                {8088, 4},
                {123, 0},
                {81238, 2},
                {88788, 6},
                {8234, 1},
                {2348, 1},
                {23884, 3},
                {0, 0},
                {1818188, 5},
                {8818181, 5},
                {1080, 1},
                {188, 3},
                {88888, 9},
                {9898, 2},
                {78, 1},
        };
    }

    @Test(dataProvider = "count8Data")
    public void shouldCompute8(int number, int extd) {
        assertEquals(recursion1.count8(number), extd);
    }

    @DataProvider
    private static Object[][] powerNData() {
        return new Object[][]{
                {3, 1, 3},
                {3, 2, 9},
                {3, 3, 27},
                {2, 1, 2},
                {2, 2, 4},
                {2, 3, 8},
                {2, 4, 16},
                {2, 5, 32},
                {10, 1, 10},
                {10, 2, 100},
                {10, 3, 1000},
        };
    }

    @Test(dataProvider = "powerNData")
    public void shouldComputePowerN(int base, int n, int exptd) {
        assertEquals(recursion1.powerN(base, n), exptd);
    }

    @DataProvider
    private static Object[][] countXData() {
        return new Object[][]{
                {"xxhixx", 4},
                {"xhixhix", 3},
                {"hi", 0},
                {"h", 0},
                {"x", 1},
                {"", 0},
                {"hihi", 0},
                {"hiAAhi12hi", 0},
        };
    }

    @Test(dataProvider = "countXData")
    public void shouldComputeX(String str, int exptd) {
        assertEquals(recursion1.countX(str), exptd);
    }

    @DataProvider
    private static Object[][] countHiData() {
        return new Object[][]{
                {"xxhixx", 1},
                {"xhixhix", 2},
                {"hi", 1},
                {"hihih", 2},
                {"h", 0},
                {"", 0},
                {"ihihihihih", 4},
                {"ihihihihihi", 5},
                {"hiAAhi12hi", 3},
                {"xhixhxihihhhih", 3},
                {"ship", 1},
        };
    }

    @Test(dataProvider = "countHiData")
    public void shouldComputeHi(String str, int exptd) {
        assertEquals(recursion1.countHi(str), exptd);
    }

    @DataProvider
    private static Object[][] changeXYData() {
        return new Object[][]{
                {"codex", "codey"},
                {"xxhixx", "yyhiyy"},
                {"xhixhix", "yhiyhiy"},
                {"hiy", "hiy"},
                {"h", "h"},
                {"x", "y"},
                {"", ""},
                {"xxx", "yyy"},
                {"yyhxyi", "yyhyyi"},
                {"hihi", "hihi"},
        };
    }

    @Test(dataProvider = "changeXYData")
    public void shouldReplaceXY(String input, String exptdOutput) {
        assertEquals(recursion1.changeXY(input), exptdOutput);
    }

    @DataProvider
    private static Object[][] changePiData() {
        return new Object[][]{
                {"xpix", "x3.14x"},
                {"pipi", "3.143.14"},
                {"pip", "3.14p"},
                {"pi", "3.14"},
                {"hip", "hip"},
                {"p", "p"},
                {"x", "x"},
                {"", ""},
                {"pixx", "3.14xx"},
                {"xyzzy", "xyzzy"},
        };
    }

    @Test(dataProvider = "changePiData")
    public void shouldChangePi(String input, String exptdOutput) {
        assertEquals(recursion1.changePi(input), exptdOutput);
    }

    @DataProvider
    private static Object[][] noXData() {
        return new Object[][]{
                {"xaxb", "ab"},
                {"abc", "abc"},
                {"xx", ""},
                {"", ""},
                {"axxbxx", "ab"},
                {"Hellox", "Hello"},
        };
    }

    @Test(dataProvider = "noXData")
    public void shouldRemoveX(String input, String exptdOutput) {
        assertEquals(recursion1.noX(input), exptdOutput);
    }

    @DataProvider
    private static Object[][] array6Data() {
        return new Object[][]{
                {new int[]{1, 6, 4}, 0, true},
                {new int[]{1, 4}, 0, false},
                {new int[]{6}, 0, true},
                {new int[]{}, 0, false},
                {new int[]{6, 2, 2}, 0, true},
                {new int[]{2, 5}, 0, false},
                {new int[]{1, 9, 4, 6, 6}, 0, true},
                {new int[]{2, 5, 6}, 0, true},
        };
    }

    @Test(dataProvider = "array6Data")
    public void shouldTestFor6Existence(int[] nums, int index, boolean exptdResult) {
        assertEquals(recursion1.array6(nums, index), exptdResult);
    }

    @DataProvider
    private static Object[][] array11Data() {
        return new Object[][]{
                {new int[]{1, 2, 11}, 0, 1},
                {new int[]{11, 11}, 0, 2},
                {new int[]{1, 2, 3, 4}, 0, 0},
                {new int[]{1, 11, 3, 11, 11}, 0, 3},
                {new int[]{11}, 0, 1},
                {new int[]{1}, 0, 0},
                {new int[]{}, 0, 0},
                {new int[]{11, 2, 3, 4, 11, 5}, 0, 2},
                {new int[]{11, 5, 11}, 0, 2},
        };
    }

    @Test(dataProvider = "array11Data")
    public void shouldCount11(int[] nums, int index, int exptdCount) {
        assertEquals(recursion1.array11(nums, index), exptdCount);
    }

    @DataProvider
    private static Object[][] array220Data() {
        return new Object[][]{
                {new int[]{1, 2, 20}, 0, true},
                {new int[]{3, 30}, 0, true},
                {new int[]{3}, 0, false},
                {new int[]{}, 0, false},
                {new int[]{3, 3, 30, 4}, 0, true},
                {new int[]{2, 19, 4}, 0, false},
                {new int[]{20, 2, 21}, 0, false},
                {new int[]{20, 2, 21, 210}, 0, true},
                {new int[]{2, 200, 2000}, 0, true},
                {new int[]{0, 0}, 0, true},
                {new int[]{1, 2, 3, 4, 5, 6}, 0, false},
                {new int[]{1, 2, 3, 4, 5, 50, 6}, 0, true},
                {new int[]{1, 2, 3, 4, 5, 51, 6}, 0, false},
                {new int[]{1, 2, 3, 4, 4, 50, 500, 6}, 0, true},
        };
    }

    @Test(dataProvider = "array220Data")
    public void shouldCountArray220(int[] nums, int index, boolean exptdResult) {
        assertEquals(recursion1.array220(nums, index), exptdResult);
    }

    @DataProvider
    private static Object[][] allStarData() {
        return new Object[][]{
                {"hello", "h*e*l*l*o"},
                {"abc", "a*b*c"},
                {"ab", "a*b"},
                {"a", "a"},
                {"", ""},
                {"3.14", "3*.*1*4"},
                {"Chocolate", "C*h*o*c*o*l*a*t*e"},
                {"1234", "1*2*3*4"},
        };
    }

    @Test(dataProvider = "allStarData")
    public void shouldStarStrings(String input, String exptdOutput) {
        assertEquals(recursion1.allStar(input), exptdOutput);
    }

    @DataProvider
    private static Object[][] pairStarData() {
        return new Object[][]{
                {"hello", "hel*lo"},
                {"xxyy", "x*xy*y"},
                {"aaaa", "a*a*a*a"},
                {"aaab", "a*a*ab"},
                {"aa", "a*a"},
                {"a", "a"},
                {"", ""},
                {"noadjacent", "noadjacent"},
                {"abba", "ab*ba"},
                {"abbba", "ab*b*ba"},
        };
    }

    @Test(dataProvider = "pairStarData")
    public void shouldStarNeighbouring(String input, String exptdOutput) {
        assertEquals(recursion1.pairStar(input), exptdOutput);
    }

    @DataProvider
    public static Object[][] endXData() {
        return new Object[][]{
                {"xxre", "rexx"},
                {"xxhixx", "hixxxx"},
                {"xhixhix", "hihixxx"},
                {"hiy", "hiy"},
                {"h", "h"},
                {"x", "x"},
                {"xx", "xx"},
                {"", ""},
                {"bxx", "bxx"},
                {"bxax", "baxx"},
                {"axaxax", "aaaxxx"},
                {"xxhxi", "hixxx"},
        };
    }

    @Test(dataProvider = "endXData")
    public void shouldMoveXsToTheEnd(String input, String exptdOutput) {
        assertEquals(recursion1.endX(input), exptdOutput);
    }

    @DataProvider
    public static Object[][] countPairsData() {
        return new Object[][]{
                {"axa", 1},
                {"axax", 2},
                {"axbx", 1},
                {"hi", 0},
                {"hihih", 3},
                {"ihihhh", 3},
                {"ihjxhh", 0},
                {"", 0},
                {"a", 0},
                {"aa", 0},
                {"aaa", 1},
        };
    }

    @Test(dataProvider = "countPairsData")
    public void shouldCountPairs(String input, int exptdCount) {
        assertEquals(recursion1.countPairs(input), exptdCount);
    }

    @DataProvider
    public static Object[][] countAbcData() {
        return new Object[][]{
                {"abc", 1},
                {"abcxxabc", 2},
                {"abaxxaba", 2},
                {"ababc", 2},
                {"abxbc", 0},
                {"aaabc", 1},
                {"hello", 0},
                {"", 0},
                {"ab", 0},
                {"aba", 1},
                {"aca", 0},
                {"aaa", 0},
        };
    }

    @Test(dataProvider = "countAbcData")
    public void shouldCountABAandABC(String input, int exptdCount) {
        assertEquals(recursion1.countAbc(input), exptdCount);
    }

    @DataProvider
    private static Object[][] count11Data() {
        return new Object[][]{
                {"11abc11", 2},
                {"abc11x11x11", 3},
                {"111", 1},
                {"1111", 2},
                {"1", 0},
                {"", 0},
                {"hi", 0},
                {"11x111x1111", 4},
                {"1x111", 1},
                {"1Hello1", 0},
                {"Hello", 0},
        };
    }

    @Test(dataProvider = "count11Data")
    public void shouldCount11(String input, int exptdCount) {
        assertEquals(recursion1.count11(input), exptdCount);
    }

    @DataProvider
    private static Object[][] stringCleanData() {
        return new Object[][]{
                {"yyzzza", "yza"},
                {"abbbcdd", "abcd"},
                {"Hello", "Helo"},
                {"XXabcYY", "XabcY"},
                {"112ab445", "12ab45"},
                {"Hello Bookkeeper", "Helo Bokeper"},
        };
    }

    @Test(dataProvider = "stringCleanData")
    public void shouldCleanString(String input, String exptdOutput) {
        assertEquals(recursion1.stringClean(input), exptdOutput);
    }
}