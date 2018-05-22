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

}
