package com.ljx;

import com.sun.javaws.IconUtil;

import java.awt.*;
import java.io.*;
import java.nio.BufferOverflowException;
import java.util.Arrays;
import java.util.Scanner;

// staitic成员变量跟普通成员变量的调用方式不同
class Node{
    public void f(){
        System.out.println("function: F");
    }

    public static void g(){
        System.out.println("Function: G");
    }
}

public class Main {
    public static void main(String[] args){
        Node node = new Node();
        node.f();

        Node.g();
    }
}