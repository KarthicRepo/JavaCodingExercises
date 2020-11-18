package com.selenium.patterns.codingpractise;

import java.util.Arrays;

public class CheckIfTextIsAnagram {
    public static void main(String[] args) {
        System.out.println(anagramCheck("kart","rakt"));
        System.out.println(anagramCheck("abcd","DcBa"));
        System.out.println(anagramCheck("MuTe","tUmE"));
        System.out.println(anagramCheck("KavI","VikA"));
        System.out.println(anagramCheck("abcd","abce"));
        System.out.println(anagramCheck("xyzp","xyzq"));
    }

    static private boolean anagramCheck(String s1, String s2){
        char[] strChar_1=s1.toLowerCase().toCharArray();
        char[] strChar_2=s2.toLowerCase().toCharArray();

        Arrays.sort(strChar_1);
        Arrays.sort(strChar_2);

        return Arrays.equals(strChar_1,strChar_2);
    }
}
