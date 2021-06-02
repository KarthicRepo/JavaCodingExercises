package com.java.learning.junk;

import java.util.ArrayList;
import java.util.List;


public class FibanacciRecursive {
    static int n1=0;
    static int n2=1;
    static int n3=0;
    public static void main(String[] args) {
        System.out.println(generateFibnacci(15,new ArrayList<Integer>()));
    }

    static private List<Integer> generateFibnacci(int N, List<Integer> fibList){
        if(N ==0)
            return fibList;
        else{
            fibList.add(n3);
            n1=n2;
            n2=n3;
            n3=n1+n2;
          return generateFibnacci(--N,fibList);
        }
    }
}
