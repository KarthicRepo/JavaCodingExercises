package com.java.learning.practise3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(findLongestPalindrome("forgeeksskeegfor"));
    }

    private static List<String> findLongestPalindrome(String str){
        HashSet<String> set= new HashSet<>();
        TreeMap<Integer, List<String>> treeMap= new TreeMap<>();
        int len=str.length()-1;
        for( int i=0; i<len-1;i++){
            for(int j=len;j>i;j--){
                String tempStr=str.substring(i,j+1);
                if(isPalindrome(tempStr)){
                    set.add(tempStr);
                }
            }
        }

        for(String palStr:set){
            Integer length= palStr.length();
            List<String> tempList= treeMap.get(length)==null?new ArrayList<>():treeMap.get(length);
            tempList.add(palStr);
            treeMap.put(length,tempList);
        }

        return treeMap.get(treeMap.descendingKeySet().toArray()[0]);
    }

    private static boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().toLowerCase().equals(str);
    }
}
