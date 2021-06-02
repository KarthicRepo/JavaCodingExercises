package com.java.learning.junk;

public class StringRotation {
    public static void main(String[] args) {
        String orgStr="karthic";
        for(int i=0;i<=7;i++){
            System.out.println(rotateStringByPostion(orgStr,i));
        }
    }

    static private String rotateStringByPostion(String str,int pos){
        char[] tempChars=str.toCharArray();
        int size=tempChars.length-1;
        for(int i=0;i<pos;i++){
            char temp=tempChars[size];
            for(int j=size;j>0;j--){
                tempChars[j]=tempChars[j-1];
            }
            tempChars[0]=temp;
        }
        return new String(tempChars);
    }
}
