package com.selenium.patterns.codingpractise2;

public class ArrayReverseRecursive {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        revArray(nums.clone());
        revRecur(nums,0,nums.length-1);
        printArr(nums);
    }

    static private void revArray(int[] nums) {
        int size = nums.length - 1;
        int left = 0, right = size;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
            left++;
        }
        printArr(nums);
    }

    static private void revRecur(int[] nums, int left, int right) {
        if(left>=right)
            return;
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;

        revRecur(nums,++left,--right);
    }

    private static void printArr(int[] arr) {
        System.out.println();
        for (int in : arr)
            System.out.print(in + " ");
    }
}
