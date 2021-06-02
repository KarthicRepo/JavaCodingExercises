package com.java.learning.practise3;

import java.util.PriorityQueue;
import java.util.Queue;

public class CheckIfConsecutiveNums {
    public static void main(String[] args) {
        checkIfConsecutiveNums(new int[]{1,5,6,2,4,3});
        checkIfConsecutiveNums(new int[]{5,6,2,4,3});
        checkIfConsecutiveNums(new int[]{8,1,5,6,7,2,4,3});

        System.out.println();
        checkIfConsecutiveNums(new int[]{8,1,7,2,4,3});
        checkIfConsecutiveNums(new int[]{1,6,2,4,3});
        checkIfConsecutiveNums(new int[]{5,6,8,2,4,3});
    }

    private static void checkIfConsecutiveNums(int[] nums) {
        boolean flag = true;
        Queue<Integer> queue = new PriorityQueue<>(100);
        for (Integer in : nums) {
            queue.add(in);
        }
        int start = queue.peek();
        for (int i = 0; i < nums.length; i++) {
            if (start+i != queue.remove()) {
                flag = false;
                System.out.println("Not a consecutive array.");
                break;
            }
        }
        if(flag) System.out.println("Its a consecutive array");

    }
}
