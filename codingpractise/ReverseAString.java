package com.selenium.patterns.codingpractise;

public class ReverseAString {
    public static void main(String[] args) {
        String text="karthic";
        System.out.println(reversRec(text));
        System.out.println(reverseItr("karthic"));
        System.out.println(revStrSpecialChar("K@arthi(cK@ali@app@a$&k"));
    }
    private static String reversRec(String str){
        if(str.length()==0)
            return str;

        return reversRec(str.substring(1,str.length()))+str.charAt(0);
    }

    private static String reverseItr(String str){
        int left=0;
        int right=str.length()-1;
        char[] strChar=str.toCharArray();

        while(left <= right){
            char temp=strChar[left];
            strChar[left]=strChar[right];
            strChar[right]=temp;
            left++;right--;
        }
        return new String(strChar);
    }

    private static String revStrSpecialChar(String str){
        int left=0;
        int right=str.length()-1;
        char[] charStr=str.toCharArray();
        while(left < right){
            while(!isAlpha(charStr[left]) && (left < right)){
                left++;
            }
            while(!isAlpha(charStr[right]) && (left < right)){
                right--;
            }
            char temp = charStr[left];
            charStr[left]=charStr[right];
            charStr[right]=temp;
            left++;right--;
        }
        return  new String(charStr);
    }

     static private boolean isAlpha(char ch){
        String a2z="abcdefghijklmnopqrstuvwxyz";
        return a2z.contains((ch+"").toLowerCase());
     }
}
