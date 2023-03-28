package com.ljx;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws   Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Hello World\n");
        bw.flush(); // 用bufferedwriter记得要手动刷新缓冲区，才会有输出
    }
}