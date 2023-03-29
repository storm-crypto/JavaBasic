package com.ljx;

import java.util.*;


public class Main {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.remove();
        System.out.println(q.peek());
    }
}