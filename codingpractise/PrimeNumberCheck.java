package com.selenium.patterns.codingpractise;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int N = 97;

        for(int k=1;k<25;k++)
            System.out.println("is "+k+" prime?: "+isPrimeNum(k));

    }

    static private boolean isPrimeNum(int N) {
        if (N == 2 || N == 1)
            return true;
        if (N % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(N)+1; i += 2) {
            if (N % i == 0)
                return false;
        }
        return true;
    }
}
