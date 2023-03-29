package com.ljx;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args){
       List<Integer> list = new ArrayList<>();

       list.add(1);
       list.add(2);
       list.set(0, 100);

        System.out.println(list.get(0));
    }
}