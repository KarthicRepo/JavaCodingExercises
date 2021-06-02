package com.java.learning.practise3;

import com.java.learning.codingpractise.PrintConsecutiveCharsFromAString;

public class AllSorting {

    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] nums_2=nums.clone();
        int[] num_3=nums.clone();

        System.out.print("Original arr:");
        printArr(nums);
        bubbleSort(nums);
        printArr(nums);

        selectionSort(nums_2);
        printArr(nums_2);

        insertionSort(num_3);
        printArr(num_3);

    }

    public static void bubbleSort(int[] arr) {
        int size = arr.length - 1;
        for (int i = size; i >= 0; i--) {
            for (int k = 0; k < i; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        int size=arr.length-1;
        for(int i=0;i<=size;i++){
            int min=i;
            for(int j=i+1;j<=size;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }

            int temp= arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void insertionSort(int[] arr){
        int size=arr.length-1;

        for(int i=1;i<=size;i++){
            int temp=arr[i];
            int in=i;
            while(in>0 && arr[i-1]>temp){
                arr[in]=arr[in-1];
                in--;
            }
            arr[in]=temp;
        }
    }

    static void printArr(int[] arr){
        for(int num: arr)
        System.out.print(num+"\t");

        System.out.println();
    }
}
