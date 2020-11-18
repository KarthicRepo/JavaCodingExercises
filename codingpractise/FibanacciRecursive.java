package com.selenium.patterns.codingpractise;

import java.util.ArrayList;
import java.util.List;

public class FibanacciRecursive {
    static int n1=0,n2=1,n3=0;
    public static void main(String[] args) {
    System.out.println(genFibRec(10, new ArrayList<Integer>()));
    }

    private static List<Integer> genFibRec(int size, List<Integer> fibList){
        if(size == 0){
            return fibList;
        }
        fibList.add(n3);
        n1=n2;
        n2=n3;
        n3=n1+n2;
        return genFibRec(--size,fibList);
    }
}
