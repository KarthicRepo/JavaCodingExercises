package com.java.learning.practise3;

public class Count012InAnArr {
    public static void main(String[] args) {

    }


    private static void segregateArr(int[] nums) {
        int[] freq = new int[3];
        for (int num : nums) {
            freq[num] += 1;
        }
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                nums[index] = i;
                index++;
            }
        }
    }
}
