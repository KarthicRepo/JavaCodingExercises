package com.selenium.patterns.codingpractise2;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    static List<String> permuteList= new ArrayList<>();
    public static void main(String[] args) {
        String text="ABCD";
        int left=0;
        int right=text.length()-1;
        permutate(text,left,right);
        System.out.println(permuteList);
    }

    static private void permutate(String str, int left, int right){
        if(left==right){
            permuteList.add(str);
        }
        else {
            for(int i=left;i<=right;i++){
                str=swap(str,left,i);
                permutate(str,left+1,right);
                str=swap(str,left,i);
            }
        }

    }

    private static String swap(String str, int left, int right) {
        char[] tempStr= str.toCharArray();
        char temp = tempStr[left];
        tempStr[left]= tempStr[right];
        tempStr[right]=temp;

        return String.valueOf(tempStr);
    }
}
