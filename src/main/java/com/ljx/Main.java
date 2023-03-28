package com.ljx;

import com.sun.javaws.IconUtil;

import java.awt.*;
import java.io.*;
import java.nio.BufferOverflowException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] a = new int[5]; // 数组初始化
        int n = 10;
        float[] b = new float[n];
        char[] c = {'a', 'b', 'c'};
        char[] d = c;
        d[1] = 'x';
        System.out.println(c[1]);
    }
}