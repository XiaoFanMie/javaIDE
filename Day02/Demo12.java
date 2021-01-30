package com.javabase.Day02;

public class Demo12 {
    public static void main(String[] args) {
        /*
        for循环
        先执行第一部分,变量初始化,只执行一次
        进入循环的次数为多次
        循环语句执行多次
        变量更新多次
         */
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        */

        /*
        相同的死循环,for和while的那个速度快
         */
        for (;;) {
            System.out.println("死循环");
        }

    }
}
