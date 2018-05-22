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


}
