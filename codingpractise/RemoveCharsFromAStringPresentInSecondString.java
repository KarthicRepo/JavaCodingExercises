package com.java.learning.codingpractise;

public class RemoveCharsFromAStringPresentInSecondString {
    public static void main(String[] args) {
        String str1="hello world data structures programming alogs";
        String str2="rmdb";

        for(char ch:str2.toCharArray()){
            str1=removeCharFromString(str1,ch);
        }
        System.out.println(str1);
    }

    private static String removeCharFromString(String str, char ch){
        if(str.length()==0)
            return str;
        int index=str.indexOf(ch);
        if(index == -1)
            return str;

        return removeCharFromString(str.substring(0,index)+str.substring(index+1,str.length()),ch);
    }
}
