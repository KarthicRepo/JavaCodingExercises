package com.java.learning.junk;

public class NthFibanaaciNumber {

    public static void main(String[] args) {
       System.out.println(fibRec(10));
    }
    // 0 1 1 2 3 5 8 13 21 34
    // 1 2 3 4 5 6 7 8  9  10
    static private int fibRec(int N){
        if(N < 2)
            return N;
        return fibRec(N-1)+fibRec(N-2);
    }
}
