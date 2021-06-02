package com.java.learning.codingpractise;

import java.util.*;

public class LongestPalindromicSubString {

    static TreeMap<Integer, List<String>> treeMap = new TreeMap<>();
    static HashSet<String> hashSet = new HashSet<>();
    public static void main(String[] args) {

        String text = "forgeeksskeegfor";
        generatePalindromicComb(text);

        int N = 2;
        System.out.println(N+getNthPostFix(N)+" Longest Palindrome sub String is:"+
                treeMap.get(treeMap.descendingKeySet().toArray()[N - 1])
        );
    }

    static void generatePalindromicComb(String str) {

        int size = str.length() - 1;
        int left = 0, right = size;
        for (int i = left; i < size; i++) {
            for (int j = size; j > i; j--) {
                if (str.charAt(i) == str.charAt(j)) {
                    addStringIfPalindrome(str.substring(i, j + 1));
                }
            }
        }

        for (String palStr : hashSet) {
            Integer len = palStr.length();
            List<String> temList = treeMap.get(len) == null ? new ArrayList<>() : treeMap.get(len);
            temList.add(palStr);
            treeMap.put(len, temList);
        }
        System.out.println(treeMap);
    }

    static private void addStringIfPalindrome(String str) {
        if (isPalindrome(str)) {
            hashSet.add(str);
        }
    }

    static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    static String getNthPostFix(int N){
        switch(N){
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default:return "th";
        }
    }
}
