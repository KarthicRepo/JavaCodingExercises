package com.selenium.patterns.codingpractise;

public class ReverseANumber {
    public static void main(String[] args) {
        int num=12345;
        System.out.println(revNumRec(num,0,0));
    }

    static private int revNumRec(int num,int rem, int rev){
        if(num==0)
            return rev;
        rem=num%10;
        rev=(rev*10)+rem;
        num=num/10;
        return revNumRec(num,rem,rev);
    }
}
