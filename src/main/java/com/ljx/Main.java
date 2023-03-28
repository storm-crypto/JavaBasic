package com.ljx;

public class Main {
    public static void main(String[] args) {
        char c = 'A';
        int x = (int)c;
        int y = 12;
        double z = y; // 隐式类型转化只能从低到高变化
        System.out.println(x);
        System.out.println(z);

    }
}