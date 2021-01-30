package com.javabase.Day02;

public class Demo03 {
    public static void main(String[] args) {
        /*
        比较运算符
            == !=
            用于数值与数值  布尔类型间  引用类型之间
         */
        int x=10;
        int y=5;
        System.out.println(x == y);
        System.out.println(x != y);

        System.out.println("-------------------");

        boolean x1=true;
        boolean y1=false;
        System.out.println(x1 == y1);
        System.out.println(x1 != y1);

        System.out.println("-------------------");
        String x2="a";
        String y2="b";
        System.out.println(x2 == y2);
        System.out.println(x2 != y2);

    }
}
