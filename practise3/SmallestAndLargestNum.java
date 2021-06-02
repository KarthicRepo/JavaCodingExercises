package com.java.learning.practise3;

public class SmallestAndLargestNum {
    public static void main(String[] args) {
        int[] nums={2,3,5,6,7,1,10,9,8};
        findSmallAndLargestNum(nums);
    }

    private static void findSmallAndLargestNum(int[] arr){
        int small=0;
        int large=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[small]) small=i;
            else if(arr[i]>arr[large]) large=i;
        }
        System.out.println("Largest:"+arr[large]);
        System.out.println("Smallest:"+arr[small]);
    }
}
