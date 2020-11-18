package com.selenium.patterns.codingpractise;

public class ReverseASentence {
    public static void main(String[] args) {
        String text="A Quick Brown Fox Jumps Over The Lazy Dog";
        System.out.println(reverseSentence(text));
        System.out.println(reverseSentenceIncludingChars(text));
    }

    static private String reverseSentence(String str){
        StringBuilder sb= new StringBuilder();
        String[] strArr= str.split(" ");
        for(int i=strArr.length-1;i>=0;i--){
            sb.append(strArr[i]+" ");
        }
        return sb.toString().trim();
    }

    static private String reverseSentenceIncludingChars(String str){
        StringBuilder sb= new StringBuilder();
        String[] strArr= str.split(" ");
        for(int i=strArr.length-1;i>=0;i--){
            sb.append(reverseStr(new String(strArr[i]))+" ");
        }
        return sb.toString().trim();
    }

    static private String reverseStr(String str){
        if(str.length()==0)
            return  str;
        return reverseStr(str.substring(1,str.length()))+str.charAt(0);
    }
}
