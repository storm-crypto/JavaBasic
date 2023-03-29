package com.ljx;

import java.util.*;


public class Main {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(5, "ljx");
        map.put(7, "acwing");

        System.out.println(map);
        System.out.println(map.get(5));
        System.out.println(map.containsKey(2));
        System.out.println(map.entrySet());

        for(Map.Entry<Integer, String> p : map.entrySet()){
            System.out.println(p.getKey());
            System.out.println(p.getValue());
        }
    }
}