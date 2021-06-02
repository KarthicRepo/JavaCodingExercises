package com.java.learning.practise3;

import java.util.HashMap;
import java.util.Map;

public class GroupCharsFromAlongString {
    static Map<Character,Integer> map= new HashMap<>();

    public static void main(String[] args) {
        String str="aaaabbbbbccdeefghiiiiiiijjkkkklmmnnooppqrsttuuvvwwxxyyzz";
        groupCharsOfString(str);
    }

    private static void groupCharsOfString(String str){

        for(char ch:str.toCharArray()){
            addCharToMap(ch);
        }

        System.out.println("Grouped char from the string is:"+ map);

        Character max_ch='$';
        Integer max_count=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>max_count){
                max_count=entry.getValue();
                max_ch=entry.getKey();
            }
        }

        System.out.println("The character '"+max_ch+"' occured maximum, "+max_count+" times");
    }

    private static void addCharToMap(Character ch) {

        Integer count=map.get(ch);
        if(count==null){
            map.put(ch,1);
        }
        else{
            map.put(ch,map.get(ch)+1);
        }

    }

}
