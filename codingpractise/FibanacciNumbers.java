package com.selenium.patterns.codingpractise;

public class FibanacciNumbers {
    static int n1=0,n2=1,n3=0;
    public static void main(String[] args) {

        int N=10;
        while(N>0){
            System.out.print(n3+"\t");
            n1=n2;
            n2=n3;
            n3=n1+n2;
            N--;
        }
    }
}
