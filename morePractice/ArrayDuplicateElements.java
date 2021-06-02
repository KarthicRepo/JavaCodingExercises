package com.java.learning.junk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDuplicateElements {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 8, 8, 8, 9, 9, 10, 11, 11, 11, 11, 11, 12};
        int left_index = 0;
        int right_index = left_index + 1;
        int size = numbers.length - 1;

        while (right_index < size) {
            if (numbers[left_index] == numbers[right_index]) {
                while (right_index <= size && (numbers[left_index] == numbers[right_index])) {
                    numbers[right_index] = -1;
                    right_index++;
                }
                left_index = right_index;
                right_index = left_index + 1;
            } else {
                left_index++;
                right_index++;
            }
        }
        printArr(numbers);
        moveMinusOnesToRight(numbers);
        System.out.println("\n");

        printArr(numbers);

        List<Integer> sortedList= Arrays.stream(numbers).boxed()
                .filter(num -> num>=0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\n"+sortedList);}


    static private void moveMinusOnesToRight(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            while (nums[left] != -1 && left < right) {
                left++;
            }

            while (nums[right] == -1 && left < right) {
                right--;
            }
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right--;
            left++;
        }

    }

    static private void printArr(int[] nums) {
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}
