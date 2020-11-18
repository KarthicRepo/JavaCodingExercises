package com.selenium.patterns.codingpractise;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size = nums.length - 1;

        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        printArray(nums);

    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + "\t");
        }
    }

}
