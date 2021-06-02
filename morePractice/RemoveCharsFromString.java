package com.java.learning.junk;

public class RemoveCharsFromString {
    //static String text;
    public static void main(String[] args) {
        String text="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        System.out.println(removeCharRec(text,'a'));
    }

    private static String removeCharRec(String text, char ch){
            int index= text.indexOf(ch);
            if(index == -1)
                return text;
            return removeCharRec(text.substring(0,index)+text.substring(index+1), ch);
    }
}
