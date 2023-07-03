package com.learn.set;

import java.util.*;

public class Sets1 {
    public static void main(String[] args) {
        Set<String>names=new HashSet<>();

        names.add("Danny");
        names.add("Moshe");
        names.add("Avishai");
        names.add("Loren");

        //set is an interface that is why we use hashset
        //you can only add one appearance
        names.remove("Moshe");
        int size= names.size();
        boolean b= names.contains("Gus");

        System.out.println(names);
        //names.clear()

        //print all the set objects
        names.forEach(System.out::println);
        System.out.println();

        //Iterator set
        Iterator<String>nameIterator= names.iterator();
        while (nameIterator.hasNext()){
            String name=nameIterator.next();
            System.out.println(name);
        }

        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println();
        System.out.println(list);

        // add all is adding all the elements from one collection to the other
        Set<Integer>numSet=new HashSet<>();
        numSet.addAll(list);
        System.out.println(numSet);

        //you can remove add all and do it instead:
        Set<Integer>numSet2=new HashSet<>(list);
        System.out.println(numSet2);


        //hash implementations will take the same amount of time to do operations no matter how the collection is big

        //tree set is useful to order the set but is much slower than hashset

        //LinkedHashSet will order your items in your insertion order


    }
}
