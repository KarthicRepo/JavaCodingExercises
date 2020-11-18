package com.selenium.patterns.codingpractise;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(binarySearch(7,0, nums.length-1,nums));
        System.out.println(binarySearch(8,0, nums.length-1,nums));
        System.out.println(binarySearch(5,0, nums.length-1,nums));
        System.out.println(binarySearch(2,0, nums.length-1,nums));
        System.out.println(binarySearch(1,0, nums.length-1,nums));
        System.out.println(binarySearch(0,0, nums.length-1,nums));
        System.out.println(binarySearch(-1,0, nums.length-1,nums));

    }

    static private int binarySearch(int NUM,int left, int right, int[] nums){
        if(left>right)
            return -1;
        int mid=(left+right)/2;
        if(nums[mid]==NUM)
            return mid;
        else {
            if(nums[mid] > NUM){
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
       return binarySearch(NUM,left,right,nums);

    }
}
