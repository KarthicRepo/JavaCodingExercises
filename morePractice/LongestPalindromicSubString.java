package com.java.learning.junk;

import java.util.*;

public class LongestPalindromicSubString {
    public static void main(String[] args) {

        String text = "forgeeksskeegfor";
        TreeMap<Integer, ArrayList<String>> store = new TreeMap<>();
        System.out.println(findAllPalindromes(text));

        int N=1;
        store=findAllPalindromes(text);
        System.out.println("Longest Palindrome subString:"+store.get(store.descendingKeySet().toArray()[N-1])
        );
    }

    private static TreeMap<Integer,ArrayList<String>>  findAllPalindromes(String str) {
        HashSet<String> allCombination= new HashSet<>();
        int size=str.length()-1;
        char[] strChar=str.toCharArray();
        for(int i=0;i<size;i++){
            for(int j=i+1;j<=size;j++){
                String temp=str.substring(i,j+1);
                if(temp.charAt(0)==temp.charAt(temp.length()-1)) {
                    allCombination.add(str.substring(i, j + 1));
                }
            }
        }

        TreeMap<Integer,ArrayList<String>> treeMap= new TreeMap<>();
        for(String palStr:allCombination){
            char[] original=palStr.toCharArray();
            char[] reversed=new StringBuilder(palStr).reverse().toString().toCharArray();
            if(Arrays.equals(original,reversed)){
                Integer len=palStr.length();
                ArrayList<String> palList=(treeMap.get(len)==null?new ArrayList<String>():treeMap.get(len));
                palList.add(palStr);
                treeMap.put(len,palList);
            }
        }
        return treeMap;

    }


}

