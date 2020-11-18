package com.selenium.patterns.codingpractise;

public class FirstThreeSmallestNumbersInArray {
    public static void main(String[] args) {
        int[] nums={2,5,6,8,9,3,10};
        firstNSmallestNumbers(nums,3);
    }

    private static void firstNSmallestNumbers(int[] nums, int N){
        int size=nums.length-1;
        for(int i=size;i>=0;i--){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            if(N-- >0)
                System.out.println(nums[i]);
        }
    }
}
