package com.selenium.patterns.codingpractise;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintDuplicateCharsFromAString {
    public static void main(String[] args) {
        String text="aabcdeffghhhijjjjkklllmmnopqrssstuvvvxxxxxxxzzzzzzzzzyyyyyy";
        System.out.println(getDuplicatesOfString(text));
        Map<String,Integer> hashMap= getDuplicatesOfString(text).entrySet().stream()
                .filter(map -> map.getValue() >1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                //.forEach(e -> System.out.println(e.getKey()+"\t"+e.getValue()));
        System.out.println(hashMap);
    }

    private static HashMap<String,Integer> getDuplicatesOfString(String str){
        HashMap<String,Integer> hasMap= new HashMap<>();

        for(int i=0;i<str.length()-1;i++){
            String ch=str.charAt(i)+"";
            if(hasMap.get(ch)==null){
                hasMap.put(ch,1);
            }
            else {
                Integer currVal= hasMap.get(ch);
                hasMap.put(ch,currVal+1);
            }
        }
        return hasMap;
    }
}
