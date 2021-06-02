package com.java.learning.practise3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
       findFirstNonRepeatedChar("karthic");
        findFirstNonRepeatedChar("anagram");
        findFirstNonRepeatedChar("barbera");

        System.out.println();
        printFirstNonRepeatedChar("karthic");
        printFirstNonRepeatedChar("anagram");
        printFirstNonRepeatedChar("barbera");

    }

    private static void findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non repeating char is: " + entry.getKey());
                break;
            }

        }
    }

    private static void printFirstNonRepeatedChar(String str){
        for(char ch: str.toCharArray()){
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.println("First non repeated char is: "+ch);
                break;
            }
        }
    }
}
