package com.java.learning.practise3;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    static List<String> allCombs= new ArrayList<>();
    public static void main(String[] args) {
        String str="ABCD";
        int left=0;
        int right=str.length()-1;
        permutate(str,left,right);
        System.out.println(allCombs);

    }

    private static void permutate(String str, int left, int right){
        if(left==right){
            allCombs.add(str);
        }
        else{
            for(int i=left;i<=right;i++){
                str=swap(str, left,i);
                permutate(str, left+1,right);
                str=swap(str,left,i);
            }
        }
    }

    private static String swap(String str, int left, int right){
        char[] str_char=str.toCharArray();
        char temp=str_char[left];
        str_char[left]=str_char[right];
        str_char[right]=temp;
        return String.valueOf(str_char);
    }
}
