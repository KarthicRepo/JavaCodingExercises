package com.java.learning.codingpractise;

import java.util.HashSet;

public class PalindromicPermutationOfString {
    static HashSet<String> hashSet= new HashSet<>();
    public static void main(String[] args) {
        String str="aabbcadad";
        permutate(str,0,str.length()-1);
        System.out.println(hashSet);
    }

    static private void permutate(String str, int left, int right){
        if(left==right) {
            //System.out.println(str);
            if(isPalindrome(str))
                hashSet.add(str);
        }
        else{
            for(int i=left;i<=right;i++){
                str=swap(str,left,i);
                permutate(str,left+1,right);
                str=swap(str,left,i);
            }
        }
    }

    static private String swap(String str, int l, int r){
        char[] strChar= str.toCharArray();
        char temp= strChar[l];
        strChar[l]=strChar[r];
        strChar[r]=temp;
        return String.valueOf(strChar);
    }

    static boolean isPalindrome(String str){
        String revStr= new StringBuilder(str).reverse().toString();
        return str.equals(revStr);
    }
}
