package com.java.learning.practise3;

public class Fibanacci {

    public static void main(String[] args) {
        generateFib(10);
        sumOfFirstNFibanaaciNum(10);
        System.out.println(fibSumRecursive(10));
    }

    private static void generateFib(int count) {
        int n1 = 0, n2 = 1, n3 = 0;
        while (count-- > 0) {
            System.out.print(n3 + "\t");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        System.out.println();
    }

    private static void sumOfFirstNFibanaaciNum(int N) {
        System.out.print("Sum of first " + N );
        int sum = 0, n1 = 0, n2 = 1, n3 = 0;
        while (N-- > 0) {
            sum += n3;
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        System.out.println(" fibanacci Nums is:" + sum);
    }

    private static int fibSumRecursive(int N){
        if(N < 3)
            return N;
        return fibSumRecursive(N-1)+fibSumRecursive(N-2);
    }
}
