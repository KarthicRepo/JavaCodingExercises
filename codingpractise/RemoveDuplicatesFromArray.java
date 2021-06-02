package com.java.learning.codingpractise;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        //int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] nums = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
        //int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int size = nums.length - 1;
        int right = size;

        while (left < right) {
            do {
                while ((left < right)&&nums[right] == -1) {
                    right--;
                }
                if ((nums[left]!= -1)&&nums[left] == nums[right]) {
                    nums[right] = -1;
                }
                right--;
            }while(left < right);
            left++;
            right=size;
        }

        printArr(nums);

        Arrays.stream(nums).filter(num ->num != -1)
                //.boxed()
               .forEach(e->System.out.print(e+"\t"));
    }

    static void printArr(int[] arr){
        for(int in:arr){
            System.out.print(in+"\t");
        }
        System.out.println();
    }

}
