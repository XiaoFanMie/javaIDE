package com.javabase.Day03;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
         /*
          数组中的元素进行访问
            数组中的每个空间都有一个下标
            通过下标来访问指定位置的元素
            下标特点:整数从0开始计数到长度-1
         */
        int [] a = new int[5];
        a[0]=11;
        a[1]=22;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println("数组长度:"+a.length);

        a[5] = 10;//访问一个数组的非法索引(下标)
        /*
           程序运行时异常 :在运行时由于数据问题导致程序无法执行,
           虚拟机向控制台输出异常原因,停止运行
           Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	        at com.ff.javaarray.day1.Demo2.main(Demo2.java:29)
         */

    }
}
