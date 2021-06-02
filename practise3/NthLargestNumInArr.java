package com.java.learning.practise3;

public class NthLargestNumInArr {
    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(findNthLargestNum(nums.clone(),1));
        System.out.println(findNthLargestNum(nums.clone(),2));
        System.out.println(findNthLargestNum(nums.clone(),3));
        System.out.println(findNthLargestNum(nums.clone(),4));

    }

    private static int findNthLargestNum(int[] nums, int N){
        int size=nums.length-1;

        for(int i=size; i>=0;i--){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            if(--N == 0){
                return nums[i];
            }
        }
        return Integer.MAX_VALUE;
    }
}
