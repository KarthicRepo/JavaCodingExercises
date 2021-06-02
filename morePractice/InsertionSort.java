package com.java.learning.junk;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArr={1,2,3,4,5,6,7,8,9,10};
        int size= intArr.length-1;

        for(int i=1;i<=size;i++){
            int temp=intArr[i];
            int inner=i;
            while(inner>0 && intArr[inner-1]<temp){
                intArr[inner]=intArr[inner-1];
                inner--;
            }
            intArr[inner]=temp;
        }
        printArr(intArr);

    }

    static private void printArr(int[] arr)
    {
        for(int num: arr){
            System.out.print(num+"\t");
        }
    }
}
