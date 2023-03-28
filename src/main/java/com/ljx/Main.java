package com.ljx;

import com.sun.javaws.IconUtil;

import java.awt.*;
import java.io.*;
import java.nio.BufferOverflowException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        // 数组的输入和输出
//        int[] a = new int[5];
//        for (int i = 0; i < 5; i++) {
//            a[i] = i;
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(a[i] * a[i]);
//        }

//        // 二维数组
//        int[][] a = new int[2][3];
//        a[1][2] = 3;
//
//        int[][] b = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//
//        System.out.println(Arrays.deepToString(a));
//        System.out.println(Arrays.deepToString(b));

//        // 数组的属性length
//        int[] a = new int[10];
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = 10;
//        }

//        // 数组的排序 sort
//        int[] a = {2, 1, 5, 3, 4};
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));

        // 数组赋值fill
//        int[] a = {2, 1, 5, 3, 4};
//
//        Arrays.fill(a, 3);
//        System.out.println(Arrays.toString(a));
        // 练习 ：743. 数组中的行
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String op = sc.next();

        double[][] m = new double[12][12];

        for (int i = 0; i < 12; i++)
            for (int j = 0 ; j < 12; j++)
                m[i][j] = sc.nextDouble();
        double sum = 0;
        for (int i = 0; i < 12; i++)
            sum += m[l][i];

        if (op.equals("M")) // java中一般是用equals来判断两个字符串是否相同，跟cpp不一样
            System.out.printf("%.1f\n", sum / 12);
        else
            System.out.printf("%.1f\n", sum);
    }
}