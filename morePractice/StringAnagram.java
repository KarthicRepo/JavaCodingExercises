package com.java.learning.junk;

public class StringAnagram {
    static char[] word="ABCD".toCharArray();
    public static void main(String[] args) {
        anagramGen(word.length);
    }
    private static void anagramGen(int length) {
        if(length==1){
            return;
        }
        for(int i=0;i<length;i++){
            anagramGen(length-1);
            if(length==2)
                display();
            rotateString(length);
        }
    }

    static void rotateString(int size){
        int index=word.length-size;
        int i=0;
        char temp=word[index];
        for(i=index;i<word.length-1;i++){
            word[i]=word[i+1];
        }
        word[i]=temp;
    }
    static private void display(){
        for(char ch: word){
            System.out.print(ch);
        }
        System.out.println();
    }

}
