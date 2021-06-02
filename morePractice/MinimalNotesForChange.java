package com.java.learning.junk;

import java.util.*;

public class MinimalNotesForChange {

    static int[] denominations;
    public static void main(String[] args) {

        denominations = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

        System.out.println(getChangeForAmount(1423));
    }

    private static Map<String,Integer> getChangeForAmount(int amount){
        Map<String,Integer> change=new LinkedHashMap<>();
        int size= denominations.length-1;
        for(int i=size;i>=0;i--){
            int denom=denominations[i];
            while(amount >= denom){
                amount=amount-denom;
                String denomStr="Rs:"+denom;
                if(change.get(denomStr) == null) {
                    change.put(denomStr, 1);
                }
                else{
                    change.put(denomStr,change.get(denomStr)+1);
                }
            }
            if(amount==0)
                break;
        }
        return change;
    }
}
