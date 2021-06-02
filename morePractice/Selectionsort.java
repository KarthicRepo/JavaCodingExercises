package com.java.learning.junk;

public class Selectionsort {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int size=numbers.length-1;

        for(int i=0;i<=size;i++){
            int max=i;
            for(int j=i+1;j<size;j++){
                if(numbers[max]<numbers[j]){
                    max=j;
                }
            }
            int temp=numbers[max];
            numbers[max]=numbers[i];
            numbers[i]=temp;
        }
    printArr(numbers);
    }

    static private void printArr(int[] arr)
    {
        for(int num: arr){
            System.out.print(num+"\t");
        }
    }
}
