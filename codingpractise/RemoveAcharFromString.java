package com.selenium.patterns.codingpractise;

public class RemoveAcharFromString {
    public static void main(String[] args) {
        String text="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        System.out.println(removeChar(text,'k'));
        System.out.println(remCharRec(text,'j'));
    }

 static private String removeChar(String text,char rmChar){
        StringBuilder sb= new StringBuilder();
        for(char ch: text.toCharArray()){
            if(ch != rmChar)
                sb.append(ch+"");
        }
        return sb.toString();
 }

 static private String remCharRec(String text, char rmChar){
        int index= text.indexOf(rmChar);
        if(text.length()==0 || index== -1) return text;

        return removeChar(text.substring(0,index)+text.substring(index+1,text.length()),rmChar);
 }
}
