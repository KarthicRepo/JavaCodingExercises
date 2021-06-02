package com.java.learning.codingpractise;

import java.util.HashSet;

public class FindElementsPresentInOneArrayButNotInOther {
    public static void main(String[] args) {

        int a[] = { 1, 2, 6, 3, 4, 5 };
        int b[] = { 2, 4, 3, 1, 0 };
        findElementsPresentInFirsArrayOnly(a,b);
        findElementsFromOneElementsNotPresentInOther2(a,b);
    }

    private static void findElementsPresentInFirsArrayOnly(int[]a, int[] b){
        int a_len=a.length-1;
        int b_len=b.length-1;
        boolean flag=false;
        for(int i=0;i<=a_len;i++){
            flag=false;
            for(int j=0;j<=b_len;j++){
                if(a[i]==b[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag)
                System.out.print(a[i]+" ");
        }

    }

    static private void findElementsFromOneElementsNotPresentInOther2(int[] a,int[] b){
        HashSet<Integer> hashSet= new HashSet<Integer>();
        for(int bin:b ){
            hashSet.add(bin);
        }
        for(int ain:a){
            if(!hashSet.contains(ain))
                System.out.print(ain+" ");
        }
    }
}
