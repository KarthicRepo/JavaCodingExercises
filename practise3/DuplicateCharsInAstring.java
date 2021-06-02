package com.java.learning.practise3;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsInAstring {

    public static void main(String[] args) {
        findDuplicateChars("karthic");
        findDuplicateChars("aaaabbbbbccdeefghiiiiiiijjkkkklmmnnooppqrsttuuvvwwxxyyzz");
    }

    private static void findDuplicateChars(String str){
        Map<Character,Integer> map= new HashMap<>();
        for(char ch: str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        boolean flag=false;
        for(Character ch: map.keySet()){

            if(map.get(ch)>1) {
                System.out.println("duplicate character:"+ch+" "+map.get(ch)+" counts");
                flag=true;
            }

        }
        if(!flag) System.out.println("No duplicate chars were found");
    }
}
