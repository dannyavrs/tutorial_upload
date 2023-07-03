package com.learn.map;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap1 {
    public static void main(String[] args) {
        SortedMap<Integer,String>sortedMap=new TreeMap<>();
        sortedMap.put(1,"DANNY");
        sortedMap.put(2,"MOSHE");
        sortedMap.put(3,"AVISHAI");
        sortedMap.put(4,"LOREN");

        System.out.println(sortedMap);
        //print the first key and value
        int firstKey=sortedMap.firstKey();
        System.out.println(firstKey);
        String firstValue=sortedMap.get(firstKey);
        System.out.println(firstValue);
        //print the last key and value
        int lastkey= sortedMap.lastKey();
        String lastvalue=sortedMap.get(lastkey);
        System.out.println("lastkey: "+lastkey+ " ,lastvalue: "+lastvalue);
        SortedMap<Integer,String>submap= sortedMap.subMap(1,3);
        System.out.println(submap);
        SortedMap<Integer,String>headmap= sortedMap.headMap(3);
        System.out.println(headmap);
        SortedMap<Integer,String>tailmap= sortedMap.tailMap(2);
        System.out.println(tailmap);





    }

}
