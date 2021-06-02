package com.java.learning.junk;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10};
        int size = nums.length - 1;
        int left = 0;
        int right = size;

        while (left < right) {
            do {
                while ((left < right) && (nums[right]) == -1) {
                    right--;
                }
                if ((nums[left] != -1 && nums[left] == nums[right])) {
                    nums[right] = -1;
                }
                right--;
            } while (left < right);
            left++;
            right=size;
        }

        printArr(nums);

        Arrays.stream(nums)
                .boxed()
                .filter(num -> num.intValue() != -1)
                .forEach(e->System.out.print(e+" "));

    }

    static void printArr(int[] nums){
        for(int in:nums){
            System.out.print(in+" ");
        }
        System.out.println();
    }
}
