package com.java.learning.codingpractise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateIntInArrayStreams {
    public static void main(String[] args) {
        int[] numbers= {1,2,2,3,4,4,4,5,5,6,7,8,8,8,8,8,9,9,10};

        List<Integer> uniqInt= Arrays.stream(numbers).boxed()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqInt);
    }
}
