package com.java.learning.codingpractise2;

public class Fibanacci {
    public static void main(String[] args) {
        firstNFibanaciSeq(10);
        System.out.println();
        System.out.println(sumOfFirstNFibSeq(10));
        System.out.println();
        System.out.println(getNthFibanacciNum(9));
        System.out.println(getNthFibNum2(10));
    }

    static private void firstNFibanaciSeq(int N) {
        int n1 = 0, n2 = 1, n3 = 0;

        while (N-- > 0) {
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }

    static private int sumOfFirstNFibSeq(int N){
        int n1=0,n2=1,n3=0,sum=0;
        while(N-- > 0){
            sum=sum+n3;
            n1=n2;
            n2=n3;
            n3=n1+n2;
        }
        return sum;
    }

    static private int getNthFibanacciNum(int N){
        if(N < 2)
            return N;

        return getNthFibanacciNum(N-1)+getNthFibanacciNum(N-2);
    }

    static private int getNthFibNum2(int N){
        int n1=0,n2=1,n3=0;
        while(--N>0) {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        return n3;
    }
}
