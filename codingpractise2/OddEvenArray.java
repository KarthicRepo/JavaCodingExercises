package com.selenium.patterns.codingpractise2;

public class OddEvenArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int size=nums.length-1;
        int left=0;
        int right=size;

        while(left<right){

            while((left<right)&&!isEven(nums[left])){
                left++;
            }
            while((left<right)&&isEven(nums[right])){
                right--;
            }
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        printArr(nums);
    }

    static private boolean isEven(int num){
        return num%2==0;
    }

    static private void printArr(int[] arr){
        for(int in: arr){
            System.out.print(in+" ");
        }
    }
}
