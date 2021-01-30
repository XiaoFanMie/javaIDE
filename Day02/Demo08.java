package com.javabase.Day02;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
         /*
            控制台输入
              在使用Scanner对象时，需要在文件头带入 java.util.Scanner;
              写法为： import  java.util.Scanner;
        */
        Scanner s=new Scanner(System.in);
        System.out.println("请输入年龄");
        int age=s.nextInt();
        System.out.println("请输入姓名");
        String name=s.next();
        System.out.println("年龄："+age);
        System.out.println("姓名："+name);
    }
}
