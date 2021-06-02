package com.java.learning.codingpractise2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        NthLongestPalindromicSubString("forgeeksskeegfor",1);
    }

    private static void NthLongestPalindromicSubString(String str, int N){
        int size=str.length()-1;
        HashSet<String> hashSet= new HashSet<>();
        TreeMap<Integer,List<String>>  treeMap= new TreeMap<>();
        for(int i=0;i<size;i++){
            for(int j=size;j>i;j--){
                String subStr=str.substring(i,j+1);
                if(subStr.charAt(0)==subStr.charAt(subStr.length()-1)){
                    if(isPalindrome(subStr)) {
                        hashSet.add(subStr);
                    }
                }
            }
        }
        System.out.println(hashSet);
        for(String palStr:hashSet){
            Integer len=palStr.length();
            List<String> tempList= treeMap.get(len)==null?new ArrayList<>():treeMap.get(len);
            tempList.add(palStr);
            treeMap.put(len,tempList);
        }

        Integer NthKey= (Integer) treeMap.descendingKeySet().toArray()[N-1];
        System.out.println(treeMap.get(NthKey));
    }

    private static boolean isPalindrome(String str){
        return new StringBuilder(str.toLowerCase()).reverse().toString().equals(str.toLowerCase());
    }
}
