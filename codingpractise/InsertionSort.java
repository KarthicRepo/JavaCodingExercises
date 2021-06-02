package com.java.learning.codingpractise;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int size=nums.length-1;

        for(int i=1;i<=size;i++){
            int temp=nums[i];
            int in=i;
            while(in > 0 && nums[in-1]<temp){
                nums[in]=nums[in-1];
                in--;
            }
            nums[in]=temp;
        }
        printArray(nums);
    }
    private static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num+"\t");
        }
    }
}
