package com.selenium.patterns.codingpractise;

public class OddEvenArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int left=0;
        int right=nums.length-1;

        while (left < right){

            while (isEven(nums[left]) && left < right){
                left++;
            }
            while ((!isEven(nums[right]))&& left < right){
                right--;
            }
            int temp= nums[left];
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
    static private void printArr(int[] nums){
        for(int num:nums){
            System.out.print(num+"\t");
        }
    }
}
