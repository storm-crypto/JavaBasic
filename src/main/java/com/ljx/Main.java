package com.ljx;

import java.awt.*;
import java.io.*;
import java.nio.BufferOverflowException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws   Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(x);
    }
}