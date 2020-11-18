package com.selenium.patterns.codingpractise2;

public class NthLargestNum {
    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(getNthLargestNum(nums.clone(),1));
        System.out.println(getNthLargestNum(nums.clone(),2));
        System.out.println(getNthLargestNum(nums.clone(),3));
        System.out.println(getNthLargestNum(nums.clone(),4));
        System.out.println(getNthLargestNum(nums.clone(),5));
        System.out.println("\n");
        System.out.println(getNthSmallestNum(nums.clone(),1));
        System.out.println(getNthSmallestNum(nums.clone(),2));
        System.out.println(getNthSmallestNum(nums.clone(),3));
        System.out.println(getNthSmallestNum(nums.clone(),4));
        System.out.println(getNthSmallestNum(nums.clone(),5));
    }

    static private int getNthLargestNum(int[] nums, int N) {
        int size = nums.length - 1;
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if (--N == 0)
                return nums[i];
        }
        return Integer.MAX_VALUE;
    }

    static private int getNthSmallestNum(int[] nums, int N) {
        int size = nums.length - 1;
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if (--N == 0)
                return nums[i];
        }
        return Integer.MAX_VALUE;
    }
}
