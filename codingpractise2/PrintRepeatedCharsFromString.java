package com.java.learning.codingpractise2;

public class PrintRepeatedCharsFromString {
    public static void main(String[] args) {
        String text="aaabbbcdeeeeeeeeffffghijjjjkkkkkkkklmmmmmnopppppppqrstuuuuuuvwwwwwwxyyyyzzzza";
        printRepeatedChars(text);
    }

    static private void printRepeatedChars(String str){
        int left=0;
        int right=1;
        int size=str.length()-1;
        char[] strChar=str.toCharArray();

        while (right<size){
            boolean duplicate=false;
            while((right<size)&&strChar[left]==strChar[right]){
                right++;
                duplicate=true;
            }
            if(duplicate)
                System.out.println(str.substring(left,right));
            left=right;
            right=left+1;
        }
    }
}
