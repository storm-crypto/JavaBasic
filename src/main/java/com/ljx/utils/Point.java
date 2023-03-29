package com.ljx.utils;

public class Point{
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
