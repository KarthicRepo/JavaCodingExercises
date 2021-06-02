package com.java.learning.codingpractise;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class NthLargestStringFromAnArray {
    public static void main(String[] args) {
        String[] stringList={"apple","Book","cat","dog","Elephant","Frog","Gorilla","horse","iphone","jackal","karthic"};
        System.out.println(getNthLongestString(stringList,1));
        System.out.println(getNthLongestString(stringList,2));
        System.out.println(getNthLongestString(stringList,3));
        System.out.println(getNthLongestString(stringList,4));
        System.out.println(getNthLongestString(stringList,5));
        System.out.println(getNthLongestString(stringList,6));
    }

    static private List<String> getNthLongestString(String[] strArr, int N){

        TreeMap<Integer,List<String>> treeMap= new TreeMap<>();
        for(String str: strArr){
            Integer len= str.length();
            List<String>  tempList= treeMap.get(len)==null?new ArrayList<String>():treeMap.get(len);
            tempList.add(str);
            treeMap.put(len,tempList);
        }
        System.out.println(treeMap);
        return treeMap.get(treeMap.descendingKeySet().toArray()[N-1]);
    }
}
