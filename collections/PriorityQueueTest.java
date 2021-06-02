package com.java.learning.collections;

import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args) {
        List<Integer> lst= new ArrayList<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<=10;i++){
            pq.offer(i);
            lst.add(i);
        }
        System.out.println("Max value is:"+ Collections.max(lst));

        for(int i=0;i<=10;i++){
           System.out.print(pq.poll()+"\t ");
        }

        System.out.println();
        Iterator<Integer> itr=pq.iterator();
        while(itr.hasNext()){
            //System.out.print(itr.next()+"\t");
        }
    }
}
