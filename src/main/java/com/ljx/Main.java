package com.ljx;

import com.sun.javaws.IconUtil;
import com.ljx.utils.ColorPoint;
import com.ljx.utils.Point;
import java.awt.*;
import java.io.*;
import java.nio.BufferOverflowException;
import java.util.Arrays;
import java.util.Scanner;





public class Main {
    public static void main(String[] args){

        // 多态，同一个类的实例，调用相同的函数，运行结果不同
        Point a = new Point(3, 4);
        System.out.println(a.toString());

        a = new ColorPoint(4, 5, "green");
        System.out.println(a.toString());
    }
}