package com.java.learning.junk;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationAndCombination {
    public static void main(String[] args) {
        String text = "ABCDEFGH";
        printPermutation(text);
    }

    static private void printPermutation(String str) {
        char[] strChar = str.toCharArray();
        int len = strChar.length - 1;
        List<String> strList = new ArrayList<>();

        for (int i = 0; i <= len - 3; i++) {
            for (int j = i + 1; j <= len - 2; j++) {
                for (int k = j + 1; k <= len - 1; k++) {
                    for (int l = k + 1; l <= len; l++) {
                        // System.out.print(strChar[i]+""+strChar[j]+""+strChar[k]);
                        strList.add(strChar[i] + "" + strChar[j] + "" + strChar[k] + "" + strChar[l]);
                    }
                }
            }
        }
        System.out.println(strList);
    }
}
