package com.java.learning.junk;

import java.util.Arrays;

public class CheckAnagramOfGivenTexts {

    public static void main(String[] args) {
        System.out.println(anagramCheck("kart","rakt"));
        System.out.println(anagramCheck("abcd","DcBa"));
        System.out.println(anagramCheck("MuTe","tUmE"));
        System.out.println(anagramCheck("KavI","VikA"));
        System.out.println(anagramCheck("abcd","abce"));
        System.out.println(anagramCheck("xyzp","xyzq"));
    }

    private static boolean anagramCheck(String s1, String s2){
        char[] s1Chars=s1.toLowerCase().toCharArray();
        char[] s2Chars=s2.toLowerCase().toCharArray();
        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);
        return Arrays.equals(s1Chars,s2Chars);
    }
}
