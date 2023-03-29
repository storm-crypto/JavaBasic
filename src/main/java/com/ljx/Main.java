package com.ljx;

import com.sun.javaws.IconUtil;

import java.awt.*;
import java.io.*;
import java.nio.BufferOverflowException;
import java.util.Arrays;
import java.util.Scanner;

class Point{
    private int x; // 私有变量在子类中也不能被访问
    private int y;

    public Point(int x){
        this.x = x;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
}

class ColorPoint extends Point{
    private String color;

    public ColorPoint(int x, int y, String color){
        super(x, y); // 父类
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 重写父类函数
    public String toString(){
        return String.format("(%d, %d, %s)", super.getX(), super.getY(), color);
    }
}

public class Main {
    public static void main(String[] args){

        // 多态，同一个类的实例，调用相同的函数，运行结果不同
        Point a = new Point(3, 4);
        System.out.println(a.toString());

        a = new ColorPoint(4, 5, "green");
        System.out.println(a.toString());
    }
}