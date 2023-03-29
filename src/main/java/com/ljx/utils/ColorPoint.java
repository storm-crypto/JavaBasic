package com.ljx.utils;


public class ColorPoint extends Point {
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
