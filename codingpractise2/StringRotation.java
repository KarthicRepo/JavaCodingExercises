package com.java.learning.codingpractise2;

public class StringRotation {
    public static void main(String[] args) {
        String str="abcdef";
        for(int i=1;i<str.length();i++){
            System.out.println("LeftRotate by "+i+"position: "+rotateLeft(str,i));
            System.out.println("RightRotate by "+i+"position: "+rotateRight(str,i));
        }
    }

    static private String rotateLeft(String str, int pos){
        String rotatedStr=str.substring(pos)+str.substring(0,pos);
        return rotatedStr;
    }

    static private String rotateRight(String str, int pos){
        int len=str.length();
        String rotatedStr=rotateLeft(str,(len - pos));
        return rotatedStr;
    }
}
