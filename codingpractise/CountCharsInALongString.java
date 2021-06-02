package com.java.learning.codingpractise;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharsInALongString {
    static HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        String text = "abbccdefggghhijjjjjkkkkkkkllmnopppppqrrrstuuvvwwxxyyyyyzzzzzzzzaaaabbb";
        char[] strChar = text.toCharArray();
        int size = text.length() - 1;
        int left = 0;
        int right = left + 1;

        while (left < size) {

            addEntryToMap(strChar[left]);
            while (strChar[left] == strChar[right] && (right < size)) {
                    addEntryToMap(strChar[right]);
                    right++;
            }
            left=right;
            right=left+1;

        }
        System.out.println(hashMap);
        Map<String,Integer> mapValues=hashMap.entrySet().stream()
                .filter(map -> map.getValue() >1)
                .collect(Collectors.toMap(map->map.getKey(),map->map.getValue()));
        System.out.println(mapValues);
    }

    static private void addEntryToMap(char ch) {
        Integer rep = hashMap.get(ch + "");
        if (rep == null) {
            hashMap.put(ch + "", 1);
        } else {
            hashMap.put(ch + "", hashMap.get(ch + "") + 1);
        }
    }
}
