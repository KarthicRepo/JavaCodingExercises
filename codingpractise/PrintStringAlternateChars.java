package com.java.learning.codingpractise;

public class PrintStringAlternateChars {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        printStringAlternate(str);
    }

    static private void printStringAlternate(String str){
        int index=0;
        int size=str.length()-1;
        while(index <= size){
            System.out.print(str.charAt(index)+" ");
            index+=2;
        }
    }
}
