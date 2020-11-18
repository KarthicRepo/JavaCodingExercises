package com.selenium.patterns.codingpractise;

public class SumOfArrayHalfs {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10,11};
        int len=nums.length-1;
        System.out.println(finSumOfSubArray(nums,0,(len/2)));
        System.out.println(finSumOfSubArray(nums,(len/2)+1,len));

    }
    static int finSumOfSubArray(int[] arr,int start, int end){
        int sum=0;
        for(int in=start;in<=end;in++){
            sum+=arr[in];
        }
        return sum;
    }
}
