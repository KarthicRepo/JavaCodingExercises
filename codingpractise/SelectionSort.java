package com.selenium.patterns.codingpractise;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int size=nums.length-1;

        for(int i=0;i<=size;i++){
            int max=i;
            for(int j=i;j<=size;j++){
                if(nums[max]<nums[j]){
                    max=j;
                }
                int temp= nums[max];
                nums[max]=nums[i];
                nums[i]=temp;
            }
        }
        printArray(nums);
    }

    private static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num+"\t");
        }
    }
}
