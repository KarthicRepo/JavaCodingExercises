package com.java.learning.practise3;

import java.util.HashSet;
import java.util.Set;

public class CheckIfStringHasUniqueChars {
    public static void main(String[] args) {
        System.out.println(checkUniqueString("karthic"));
        System.out.println(checkUniqueString("kavitha"));
        System.out.println(checkUniqueString("Tharun"));
        System.out.println(checkUniqueString("abcda"));
        System.out.println("\n\n\n");
        System.out.println(checkUniqueString2("karthic"));
        System.out.println(checkUniqueString2("kavitha"));
        System.out.println(checkUniqueString2("Tharun"));
        System.out.println(checkUniqueString2("abcda"));
    }

    private static boolean checkUniqueString(String str){
        Set<Character> mySet= new HashSet<>();
        for(char ch:str.toCharArray()){
            if(!mySet.add(ch)) return false;
        }
        return  true;
    }

    private static boolean checkUniqueString2(String str){

        for(char ch: str.toCharArray()){
            if(str.indexOf(ch)!=str.lastIndexOf(ch)) return false;
        }
        return true;
    }
}
