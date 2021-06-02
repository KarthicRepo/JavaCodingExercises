package com.java.learning.codingpractise;

public class StringRotation {
    public static void main(String[] args) {
        String name="karthic";

        for(int i=0;i<=name.length();i++)
            System.out.println(leftRotate(name,i));

        for(int i=0;i<=name.length();i++)
            System.out.println(rightRotate(name,i));

    }

    static private String leftRotate(String str, int pos){
        return str.substring(pos)+str.substring(0,pos);
    }

    static private String rightRotate(String str, int pos){
        return leftRotate(str,(str.length()-pos));
    }
}
