package com.selenium.patterns.codingpractise;

public class PrintTheFirstNonRepeatativeChar {
    public static void main(String[] args) {
        String text="zaaaaaabbbbbcccccdddeeffgghhiijjjkllmmnnooppqqrrsttuuvvwwxxyyzzz";
        printThefirstNonRepeatativeChar(text);

    }

    private static void printThefirstNonRepeatativeChar(String str){
        char[] strChar= str.toCharArray();
        int left=0;
        int right=left+1;
        int size=strChar.length-1;

        while(right < size){
            while(right < size && strChar[left]==strChar[right] ){
                right++;
            }
            left=right;
            right=left+1;
            if(right < size && strChar[left] != strChar[right]){
                System.out.print("Found:"+strChar[left]+"\n");
            }

        }
    }
}
