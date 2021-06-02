package com.java.learning.practise3;

import java.util.Arrays;

public class CheckAnagramOfText {
    public static void main(String[] args) {
        System.out.println(checkTextAnagram("Karthi","kArThI"));
        System.out.println(checkTextAnagram("kavI","ViKA"));
        System.out.println(checkTextAnagram("abcD","BCDA"));
        System.out.println(checkTextAnagram("XyZ","zYx"));
        System.out.println(checkTextAnagram("LmNop","OPlmn"));
        System.out.println(checkTextAnagram("Karthi","karthic"));
        System.out.println(checkTextAnagram("kavitha","KavithaK"));
    }

    private static boolean checkTextAnagram(String str1, String str2){
        char[] str1_char=str1.toLowerCase().toCharArray();
        char[] str2_char=str2.toLowerCase().toCharArray();
        Arrays.sort(str1_char);
        Arrays.sort(str2_char);
        return Arrays.equals(str1_char,str2_char);
    }

}
