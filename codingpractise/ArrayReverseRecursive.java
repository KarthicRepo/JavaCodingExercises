package com.selenium.patterns.codingpractise;

public class ArrayReverseRecursive {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10,11};
        revArrRecr(nums,0,nums.length-1);
        printArray(nums);
    }

    static void revArrRecr(int[] arr, int left, int right){
        if(left > right)
            return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        revArrRecr(arr,++left,--right);
    }

    static void printArray(int[] arr){
        for(int in: arr){
            System.out.print(in+" ");
        }
    }
}
