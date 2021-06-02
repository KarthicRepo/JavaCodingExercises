package com.java.learning.junk;

public class SumOfFirstNFibanacciNumbers {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;

    public static void main(String[] args) {
        System.out.println("Sum of first 10 Fibanacci Num:"+sumOfNFibnums(0,10)
        );
    }

    private static int sumOfNFibnums(int sum, int N) {
        if (N == 0)
            return 0;
        else {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            return sum+sumOfNFibnums(n3, --N);
        }

    }
}
