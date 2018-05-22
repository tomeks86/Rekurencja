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
            return (n % 10 == 7) ? 1 + count7(n / 10) : 0 + count7(n / 10);
    }

}
