package com.selenium.patterns.codingpractise;

public class StringIsRotationOfOther {
    public static void main(String[] args) {
        String str="karthic";
        for(int i=1;i<=str.length();i++) {
            System.out.println("Rotation:"+i+" : "+rotateTextByPos(str,i));
        }
    }

    private static String rotateTextByPos(String str, int pos){
        char[] strChar= str.toCharArray();
        int size=strChar.length-1;
        for(int i=1;i<=pos;i++){
            char temp=strChar[size];
            for(int j=size;j>0;j--){
                strChar[j]=strChar[j-1];
            }
            strChar[0]=temp;
        }
        return  new String(strChar);
    }
}
