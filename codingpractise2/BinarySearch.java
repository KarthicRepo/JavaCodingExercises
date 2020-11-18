package com.selenium.patterns.codingpractise2;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("Binary search result: "+binarySearch(nums,2));
        System.out.println("Binary search result: "+binarySearch(nums,3));
        System.out.println("Binary search result: "+binarySearch(nums,5));
        System.out.println("Binary search result: "+binarySearch(nums,7));
        System.out.println("Binary search result: "+binarySearch(nums,9));
        System.out.println("Binary search result: "+binarySearch(nums,11));
        System.out.println("Binary search result: "+binarySearch(nums,20));
        System.out.println("Binary search result: "+binarySearch(nums,-1));

        System.out.println("\n\n");
        System.out.println("Binary search result: "+binarySearchRec(nums,0,nums.length-1,2));
        System.out.println("Binary search result: "+binarySearchRec(nums,0,nums.length-1,3));
        System.out.println("Binary search result: "+binarySearchRec(nums,0,nums.length-1,5));
        System.out.println("Binary search result: "+binarySearchRec(nums,0,nums.length-1,7));
        System.out.println("Binary search result: "+binarySearchRec(nums,0,nums.length-1,9));
        System.out.println("Binary search result: "+binarySearchRec(nums,0,nums.length-1,11));
        System.out.println("Binary search result: "+binarySearchRec(nums,0,nums.length-1,20));
        System.out.println("Binary search result: "+binarySearchRec(nums,0,nums.length-1,-1));

    }
    static private int binarySearch(int[] nums, int val){
        int size= nums.length-1;
        int left=0;
        int right=size;

        while(left<= right){
            int mid=(left+right)/2;
            if(nums[mid]==val)
                return mid;
            else{
                if(nums[mid]>val){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return  -1;
    }

    static private int binarySearchRec(int[] nums, int left, int right,int val){
        if(left>right)
            return -1;
        int mid=(left+right)/2;

        if(nums[mid]==val)
            return mid;
        if(nums[mid]>val)
            right=mid-1;
        else
            left=mid+1;

        return binarySearchRec(nums,left,right,val);
    }
}
