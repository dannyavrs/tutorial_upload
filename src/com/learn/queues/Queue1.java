package com.learn.queues;

import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer>queue =new LinkedList<>();
        //add until stackoverflow and then return false
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);

        //add until stackoverflow and throw exception
        queue.add(4);
        queue.add(6);

        //remove the item and also saved throw exception if there are no items in the queue
        int num=queue.remove();
        //remove the item and also saved returns null if there are no items in the queue
        int num2= queue.poll();
        //save the value throw exception if there are no items in the queue
        int num3= queue.element();
        //save the value returns null if there are no items in the queue
        int num4= queue.poll();

        //iterate queue
        Iterator<Integer>iterator= queue.iterator();
        while(iterator.hasNext()){
            int number= iterator.next();
            System.out.println(number);
        }
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        priorityQueue.add(4);
        priorityQueue.add(7);
        priorityQueue.add(3);
        System.out.println(priorityQueue);




    }
}
