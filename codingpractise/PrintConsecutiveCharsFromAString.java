package com.java.learning.codingpractise;

public class PrintConsecutiveCharsFromAString {
    public static void main(String[] args) {

        String text = "abbccdefggghhijjjjjkkkkkkkllmnopppppqrrrstuuvvwwxxyyyyyzzzzzzzzaaaabbb";
        char[] strChar=text.toCharArray();
        int left=0;
        int right=left+1;
        int size=strChar.length-1;

        while(right<=size){
            boolean duplicate=false;
            while((right<=size)&&strChar[left]==strChar[right]){
                 right++;
                 duplicate=true;
            }
            if(duplicate)
                System.out.print(text.substring(left,right));
            left=right;
            right=left+1;
        }

    }
}
