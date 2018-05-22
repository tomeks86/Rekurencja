package edu.tseidler;

public class Recursion1 {
    public int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0)
            return 0;
        else
            return 2 + bunnyEars(--bunnies);
    }

    public int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0)
            return 0;
        else if (bunnies % 2 == 1)
            return 2 + bunnyEars2(--bunnies);
        else
            return 3 + bunnyEars2(--bunnies);
    }

    public int triangle(int rows) {
        if (rows == 0)
            return 0;
        else
            return rows + triangle(--rows);
    }

    public int sumDigits(int n) {
        if (n == 0)
            return 0;
        else
            return n % 10 + sumDigits(n / 10);
    }

    public int count7(int n) {
        if (n == 0)
            return 0;
        else
            return (n % 10 == 7) ? 1 + count7(n / 10) : count7(n / 10);
    }

    public int count8(int n) {
        if (n == 0)
            return 0;
        else if (n % 100 == 88)
            return 2 + count8(n / 10);
        else if (n % 10 == 8)
            return 1 + count8(n / 10);
        else
            return count8(n / 10);
    }

    public int powerN(int base, int n) {
        if (n == 0)
            return 1;
        else
            return base * powerN(base, --n);
    }

    public int countX(String str) {
        if (str.length() == 0)
            return 0;
        else
            return str.charAt(str.length() - 1) == 'x' ? 1 + countX(str.substring(0, str.length() - 1)) : countX(str.substring(0, str.length() - 1));
    }

    public int countHi(String str) {
        return str.lastIndexOf("hi") > -1 ? 1 + countHi(str.substring(0, str.lastIndexOf("hi"))) : 0;
    }

    public String changeXY(String str) {
        return changeXY(str, str.length() - 1);
    }

    private String changeXY(String str, int index) {
        if (index == -1)
            return str;
        else
            return str.charAt(index) == 'x' ?
                    changeXY(str.substring(0, index) + 'y' + str.substring(index + 1, str.length()), index - 1) :
                    changeXY(str, index - 1);
    }

    public String changePi(String str) {
        return changePi(str, str.length() - 1);
    }

    private String changePi(String str, int index) {
        return str.lastIndexOf("pi") > -1 ?
                changePi(str.substring(0, str.lastIndexOf("pi")) + "3.14" + str.substring(str.lastIndexOf("pi") + 2, str.length()), str.lastIndexOf("pi")) :
                str;
    }

    public String noX(String str) {
        return noX(str, str.length() - 1);
    }

    private String noX(String str, int index) {
        if (index == -1)
            return str;
        else
            return str.charAt(index) == 'x' ?
                    noX(str.substring(0, index) + str.substring(index + 1, str.length()), --index) :
                    noX(str, --index);
    }

    public boolean array6(int[] nums, int index) {
        if (index == nums.length)
            return false;
        else
            return nums[index] == 6 || array6(nums, ++index);
    }

    public int array11(int[] nums, int index) {
        if (index == nums.length)
            return 0;
        else
            return nums[index] == 11 ?
                    1 + array11(nums, ++index) :
                    array11(nums, ++index);
    }

    public boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1)
            return false;
        else
            return nums[index] * 10 == nums[index + 1] || array220(nums, ++index);
    }

    public String allStar(String str) {
        return allStar(str, str.length() - 1);
    }

    private String allStar(String str, int index) {
        if (index <= 0)
            return str;
        else
            return allStar(str.substring(0, index) + '*' + str.substring(index, str.length()), --index);
    }

    public String pairStar(String str) {
        return pairStar(str, str.length() - 1);
    }

    private String pairStar(String str, int index) {
        if (index <= 0)
            return str;
        else
            return str.charAt(index) == str.charAt(index - 1) ?
                    pairStar(str.substring(0, index) + '*' + str.substring(index, str.length()), --index) :
                    pairStar(str, --index);
    }

    public String endX(String str) {
        return endX(str, str.length() - 1);
    }

    private String endX(String str, int index) {
        if (index == -1)
            return str;
        else
            return str.charAt(index) == 'x' ?
                    endX(str.substring(0, index) + str.substring(index + 1, str.length()) + 'x', --index) :
                    endX(str, --index);
    }

    public int countPairs(String str) {
        return countPairs(str, str.length() - 1);
    }

    private int countPairs(String str, int index) {
        if (index <= 1)
            return 0;
        else
            return str.charAt(index) == str.charAt(index - 2) ?
                    1 + countPairs(str, --index) :
                    countPairs(str, --index);
    }

    public int countAbc(String str) {
        if (str.length() <= 2)
            return 0;
        else {
            int abc = str.lastIndexOf("abc");
            int aba = str.lastIndexOf("aba");
            if (abc > aba) {
                return 1 + countAbc(str.substring(0, abc + 1));
            } else if (aba > -1) {
                return 1 + countAbc(str.substring(0, aba + 1));
            } else
                return 0;
        }
    }

    public int count11(String str) {
        if (str.length() < 2)
            return 0;
        else {
            int pos11 = str.lastIndexOf("11");
            return pos11 > -1 ? 1 + count11(str.substring(0, pos11)) : 0;
        }
    }

    public String stringClean(String str) {
        return stringClean(str, str.length() - 1);
    }

    private String stringClean(String str, int index) {
        if (index <= 0)
            return str;
        else
            return str.charAt(index) == str.charAt(index - 1) ?
                    stringClean(str.substring(0, index) + str.substring(index + 1, str.length()), --index) :
                    stringClean(str, --index);
    }
}
