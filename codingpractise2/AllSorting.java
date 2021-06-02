package com.java.learning.codingpractise2;

public class AllSorting {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums_2 = nums.clone();
        int[] nums_3 = nums.clone();
        bubbleSort(nums.clone());
        selectionSort(nums_2);
        insertionSort(nums_3);
    }

    private static void bubbleSort(int[] nums) {
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

    private static void selectionSort(int[] nums) {
        int size = nums.length - 1;
        for (int i = 0; i <= size; i++) {
            int max = i;
            for (int j = i+1; j <= size; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            int temp = nums[max];
            nums[max] = nums[i];
            nums[i] = temp;
        }

        printArray(nums);
    }

    private static void insertionSort(int[] nums) {
        int size = nums.length - 1;

        for (int i = 1; i <= size; i++) {
            int temp = nums[i];
            int in = i;
            while (in>0 && nums[in - 1] < temp) {
                nums[in] = nums[in - 1];
                in--;
            }
            nums[in] = temp;
        }
        printArray(nums);
    }

    private static void printArray(int[] arr) {
        System.out.println();
        for (int in : arr) {
            System.out.print(in + " ");
        }
    }
}
