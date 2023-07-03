package com.learn.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap1 {
    public static void main(String[] args) {
        NavigableMap<Integer,String>navigableMap=new TreeMap<>();
        navigableMap.put(1,"DANNY");
        navigableMap.put(2,"MOSHE");
        navigableMap.put(3,"AVISHAI");
        navigableMap.put(4,"LOREN");
        System.out.println(navigableMap);

        int firstkey=navigableMap.firstKey();
        String firstvalue=navigableMap.get(firstkey);
        System.out.println(firstkey+"="+firstvalue);

        NavigableMap<Integer,String>greaterorEqualMap=navigableMap.tailMap(2,true);
        System.out.println(greaterorEqualMap);
        NavigableMap<Integer,String>greaterorEqualMap2=navigableMap.tailMap(2,false);
        System.out.println(greaterorEqualMap2);

        NavigableMap<Integer,String>lessthanlMap=navigableMap.headMap(2,true);
        System.out.println(lessthanlMap);
        NavigableMap<Integer,String>lassthanMap2=navigableMap.headMap(2,false);
        System.out.println(lassthanMap2);

        Map.Entry<Integer, String> map=navigableMap.firstEntry();
        System.out.println(map);
        Map.Entry<Integer,String>map2=navigableMap.lastEntry();
        System.out.println(map2);





    }
}
