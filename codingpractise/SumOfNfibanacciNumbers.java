package com.java.learning.codingpractise;

public class SumOfNfibanacciNumbers {
    static int n1=0, n2=1,n3=0;
    public static void main(String[] args) {
        int N=10;
        System.out.println(sumOfFib(10,0));
    }

    static private int sumOfFib(int N,int sum){
        if(N==0)
            return 0;
        n1=n2;
        n2=n3;
        n3=n1+n2;
        return sum+sumOfFib(--N,n3);
    }
}
