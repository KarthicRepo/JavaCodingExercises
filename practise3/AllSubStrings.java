package com.java.learning.practise3;

import java.util.ArrayList;
import java.util.List;

public class AllSubStrings {
    public static void main(String[] args) {
        printAllSubString("abc");
        printAllSubString("karth");
    }

    private static void printAllSubString(String str) {
        List<String> allSubStrs = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                allSubStrs.add(str.substring(i, j));
            }
        }
        System.out.println("All substrings:" + allSubStrs);
    }
}
