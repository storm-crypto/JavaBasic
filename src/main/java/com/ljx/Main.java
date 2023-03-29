package com.ljx;

import java.util.*;


public class Main {
    public static void main(String[] args){
        TreeSet<Integer> set  = new TreeSet<>(); // 无序

        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set.ceiling(4));
    }
}