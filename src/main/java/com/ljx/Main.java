package com.ljx;

import java.util.Scanner;

interface Role{
    public void greet();
    public void move();
    public int getSpeed();
}

// 接口的继承
interface Hero extends Role{
    public void attack();
}

class Zeus implements Hero, Role{
    private final String name = "Zeus";
    public void greet(){
        System.out.println(name + ":Hi!" );
    }

    public void move(){
        System.out.println(name + ":Move!" );
    }

    public int getSpeed(){
        return 10;
    }

    public void attack(){
        System.out.println(name + ": Attack!");
    }
}

class Athena implements Hero{
    private final String name = "Athena";
    public void greet(){
        System.out.println(name + ":Hi!" );
    }

    public void move(){
        System.out.println(name + ":Move!" );
    }

    public int getSpeed(){
        return 10;
    }

    public void attack(){
        System.out.println(name + ": Attack!");
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择英雄：");
        String name = sc.next();
        Hero hero;
        if (name.equals("Zeus")) hero = new Zeus();
        else hero = new Athena();

        hero.greet();
    }
}