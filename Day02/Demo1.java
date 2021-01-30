package com.javabase.Day02;

public class Demo1 {
    public static void main(String[] args) {
        /*
            默认转换
                除了布尔类型不能转化,其他7个都可以转换
                容量小的默认转换为容量大的数据类型
                byte short char->int->long->float->double
                byte short char 不能相互转换,默认转换为int类型
        */
        byte x=1;
        short y=x;
        char v=(char)y;
        int i=v;
        long p=i;
        float f=p;
        double d=f;
        System.out.println(d);
        /*
        强制转换:
        容量大的向容量小的转换
        问题:
            1.溢出装不下
            2.精度降低
            混合运算时,小容量的自动转换为容量大的
        */
        double d1=10.5;
        int ii=(int)d1;
        float f1=(float)d1;
        System.out.println(ii);
        System.out.println(f1);
    }
}
