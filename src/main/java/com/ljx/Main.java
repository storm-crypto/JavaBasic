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
//        // 练习 ：743. 数组中的行
//        Scanner sc = new Scanner(System.in);
//        int l = sc.nextInt();
//        String op = sc.next();
//
//        double[][] m = new double[12][12];
//
//        for (int i = 0; i < 12; i++)
//            for (int j = 0 ; j < 12; j++)
//                m[i][j] = sc.nextDouble();
//        double sum = 0;
//        for (int i = 0; i < 12; i++)
//            sum += m[l][i];
//
//        if (op.equals("M")) // java中一般是用equals来判断两个字符串是否相同，跟cpp不一样
//            System.out.printf("%.1f\n", sum / 12);
//        else
//            System.out.printf("%.1f\n", sum);

        // String 字符串
//        String a = new String("Hello world");
//        String b = "My name is ";
//        String x = b;
//        String c = b + "yxc";
//        String d = "My age is " + 18;
//        String str = String.format("My age is %d", 18); // sprintf  格式话字符串
//        String pi_str = "3.1415926";
//        double pi = Double.parseDouble(pi_str); // 字符串转double
//        System.out.println(d);

//        // 字符串遍历
//        String a = "Hello World";
//
//        // 字符串的长度length要加括号，数组的长度不用加括号
//        for (int i = 0; i < a.length(); i++){
//            System.out.print(a.charAt(i)); // a[i]
//        }

//        // 常见API
//        String a = "Hello World";
//
//        // split函数
//        String[] strs = a.split(" ");
//        System.out.println(Arrays.toString(strs));
//
//        // indexof：相当于cpp的find函数
//        System.out.println(a.indexOf("o"));
//
//        // equals 函数
//        String b = "abcabc", c = "aaa";
//
//        System.out.println(b.equals(c));
//        // compareTo函数
//        System.out.println(b.compareTo(c));
//
//        // startsWith
//        System.out.println(b.startsWith("abc"));
//
//        // endWith
//
//        // trim ：去掉首尾空白字符
//        // toLowerCase
//        // toUpperCase
//        // replace
//        // substring 第一个参数：起点 第二个参数：终点的下一位，左闭右开
//        // C++里面的substr,第二个参数是长度

        // StringBuffer和StringBuffer
        // 如果需要不断的加东西，就用这个
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < 10000; i ++){
            sb.append("a");
        }
        System.out.println(sb);

    }
}