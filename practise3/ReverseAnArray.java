package com.java.learning.practise3;

public class ReverseAnArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        revArray(nums);
        printArray(nums);
    }

    private static void revArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}
