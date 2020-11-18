package com.selenium.patterns.codingpractise;

public class NthLargestNumber {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10};
        System.out.println(getNthLargestNum(5,num));
    }

    static private int getNthLargestNum(int N, int[] nums){
        int size=nums.length-1;
        int NthLargest=-1;
        for(int i=size;i>0;i--){
            for(int j=0;j<size;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            if(--N == 0){
                NthLargest=nums[i];
            }
        }
        return NthLargest;
    }

}
