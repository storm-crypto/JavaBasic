package com.ljx;

import com.sun.javaws.IconUtil;

import java.awt.*;
import java.io.*;
import java.nio.BufferOverflowException;
import java.util.Arrays;
import java.util.Scanner;

class Point{
    private int x;
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

public class Main {
    public static void main(String[] args){
        Point point = new Point(3, 4);

        point.setX(5);

        System.out.println(point.toString());
    }
}