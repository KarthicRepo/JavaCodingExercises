package com.selenium.patterns.codingpractise2;

import java.util.Arrays;

public class CheckIfTextIsAnagramOfOther {
    public static void main(String[] args) {
        System.out.println(isAnagram("kart","rakt"));
        System.out.println(isAnagram("abcd","DcBa"));
        System.out.println(isAnagram("MuTe","tUmE"));
        System.out.println(isAnagram("KavI","VikA"));
        System.out.println(isAnagram("abcd","abce"));
        System.out.println(isAnagram("xyzp","xyzq"));
    }

    private static boolean isAnagram(String s1, String s2){
        char[] char_s1=s1.toLowerCase().toCharArray();
        char[] char_s2=s2.toLowerCase().toCharArray();
        Arrays.sort(char_s1);
        Arrays.sort(char_s2);
        return Arrays.equals(char_s1,char_s2);
    }

}
