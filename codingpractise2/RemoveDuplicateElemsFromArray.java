package com.selenium.patterns.codingpractise2;

public class RemoveDuplicateElemsFromArray {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10};
        int nums2[]=nums.clone();
        markDuplicates(nums);
        moveDuplicatesToRight(nums);

        markDuplicates(nums2);
        moveDuplicatesToRight2(nums2);
    }

    private static void markDuplicates(int[] nums) {
        int size = nums.length - 1;
        int left = 0;
        int right = size;

        for (int i = 0; i < size; i++) {
            if (nums[i] != -1) {
                for (int j = i + 1; j <= size; j++) {
                    {
                        if (nums[i] == nums[j] && nums[j] != -1) {
                            nums[j] = -1;
                        }
                    }
                }
            }
        }

        printArr(nums);
    }

    private static void moveDuplicatesToRight(int[] nums){
        int size=nums.length-1;
        int left=0,right=size;
        while(left<right){

            while(nums[left]!=-1 && (left<right)){
                left++;
            }
            while(nums[right]== -1&&(left<right)){
                right--;
            }
            int temp= nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            right--;
            left++;
        }

        printArr(nums);
    }

    static private void moveDuplicatesToRight2(int[] nums){
        int left=0;
        int dupIndex=nums.length-1;
        while(left<dupIndex){

            while(nums[left]!= -1 && (left<dupIndex)){
                left++;
            }

            for(int j=left;j<dupIndex;j++){
                nums[j]=nums[j+1];
            }
            nums[dupIndex--]=-1;

        }
        printArr(nums);
    }

    static private void printArr(int[] arr) {
        System.out.println();
        for (int in : arr)
            System.out.print(in + " ");
    }
}
