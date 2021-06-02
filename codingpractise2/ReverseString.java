package com.java.learning.codingpractise2;

public class ReverseString {
    public static void main(String[] args) {
        String text="Java$&Data#@Structures*";
        reversString1(text);
        reverseStringExcludeSpecialChars(text);
        System.out.println(strRevRec(text));
    }

    private static void reversString1(String str){
        char[] strChar= str.toCharArray();
        int len=strChar.length-1;
        int left=0,right=len;

        while(left<right){
            char temp=strChar[left];
            strChar[left]=strChar[right];
            strChar[right]=temp;
            right--;left++;
        }
        System.out.println(String.valueOf(strChar));
    }

    private static void reverseStringExcludeSpecialChars(String str){
        char[] strChar= str.toCharArray();
        int len=strChar.length-1;
        int left=0,right=len;

        while (left<right){
            while(!isApha(strChar[left])){
                left++;
            }
            while(!isApha(strChar[right])){
                right--;
            }
            char temp=strChar[left];
            strChar[left]=strChar[right];
            strChar[right]=temp;
            left++;
            right--;

        }
        System.out.println(String.valueOf(strChar));
    }

    private static String strRevRec(String str){
        if(str.length()==0)
            return str;

        return strRevRec(str.substring(1))+str.charAt(0);
    }

    private static boolean isApha(char ch){
        String a2z="abcdefghijklmnopqrstuvwxyz";
        return a2z.contains((ch+"").toLowerCase());
    }
}
