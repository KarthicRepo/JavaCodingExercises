package com.java.learning.codingpractise;

public class StringPermutation {
    public static void main(String[] args) {
    permutate("abc",0,2);
    }
    private static void permutate(String str, int left, int right){
        if(left==right)
            System.out.println(str);
        else{
            for(int i=left;i<=right;i++){
                str=swap(str,left,i);
                permutate(str,left+1,right);
                str=swap(str,left,i);
            }
        }
    }

    private static String swap(String str, int a, int b){
        char[] strChar=str.toCharArray();
        char temp=strChar[a];
        strChar[a]=strChar[b];
        strChar[b]=temp;
        return String.valueOf(strChar);
    }
}
