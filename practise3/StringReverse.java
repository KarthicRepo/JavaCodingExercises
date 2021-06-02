package com.java.learning.practise3;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Reversing the string string 'k@ar#t$h%i&c':"+revRecurs("k@ar#t$h%i&c"));
        System.out.println("Reversing the string string 'karthic':"+revRecurs("karthic"));
        System.out.println("Reversing the string string 'k@ar#t$h%i&c':"+ revStrSpclChars("k@ar#t$h%i&c"));
        System.out.println("Reversing the string string 'karthic':"+revStrInbuilt("karthic"));
    }

    private static String revRecurs(String str){
        if(str.length()==1) return str;
        return revRecurs(str.substring(1))+str.charAt(0);
    }

    private static String revStrSpclChars(String str){
        char[] char_arr=str.toCharArray();
        int left=0;
        int right=char_arr.length-1;
        while (left<right){
            while(!isAlpha(char_arr[left])){
                left++;
            }
            while(!isAlpha((char_arr[right]))){
                right--;
            }
            char temp=char_arr[left];
            char_arr[left]=char_arr[right];
            char_arr[right]=temp;
            left++;right--;
        }

        return new String(char_arr);
    }

    private static String revStrInbuilt(String str){
        //return new StringBuilder(str).reverse().toString();
        return new StringBuffer(str).reverse().toString();
    }

    private static boolean isAlpha(char ch){
        String a2z="abcdefghijklmnopqrstuvwzyz";
        return a2z.contains(""+ch);
    }
}
