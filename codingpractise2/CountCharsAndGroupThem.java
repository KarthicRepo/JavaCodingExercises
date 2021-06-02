package com.java.learning.codingpractise2;

import java.util.HashMap;

public class CountCharsAndGroupThem {
    static HashMap<String, Integer> hashMap= new HashMap<>();
    public static void main(String[] args) {
        countAndGroupChars("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        System.out.println(hashMap);
        System.out.println(hashMap.size());

    }

    static private void countAndGroupChars(String str){
        for(char ch:str.toCharArray()){
            addCharToMap(ch);
        }
    }

    static private void addCharToMap(char ch){
        String chStr= ch+"";
        if(hashMap.get(chStr)==null){
            hashMap.put(chStr,1);
        }
        else {
            hashMap.put(chStr,hashMap.get(chStr)+1);
        }
    }
}
