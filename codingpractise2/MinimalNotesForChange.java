package com.selenium.patterns.codingpractise2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MinimalNotesForChange {

    static  int[] denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
    static HashMap<String,Integer> hashMap= new LinkedHashMap<>();
    public static void main(String[] args) {
        getMinimalChange(2453);
        System.out.println(hashMap);
    }

    private static void getMinimalChange(int amount){
        int size=denominations.length-1;
        for(int i=size;i>=0;i--){
            int denom=denominations[i];
            while(amount>=denom){
                amount=amount-denom;
                addNoteToWallet(denom);
            }
            if(amount==0)
                break;
        }
    }

    private static void addNoteToWallet(int denom) {
        String denomStr= "Rs:"+denom;
        if(hashMap.get(denomStr)==null){
            hashMap.put(denomStr,1);
        }
        else{
            hashMap.put(denomStr,hashMap.get(denomStr)+1);
        }
    }
}
