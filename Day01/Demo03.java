package com.javabase.Day01;

public class Demo03 {
    public static void main(String[] args) {
        /*浮点类型
        默认为double类型，要声明一个常量为float，应在后面加F
         */
        //float 4字节
        /*由于顶层二进制存储方式不同
        四字节float的表数范围大于8字节long类型        */
        float s=10.5F;

        // double 8字节
        double d=10.5;

        /*
         布尔类型分为两种true or false*/
        int a=10;
        int b=10;
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}
