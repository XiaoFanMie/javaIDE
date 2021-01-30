package com.javabase.Day02;

public class Demo07 {
    public static void main(String[] args) {
        /*
        位运算
        转换为二进制数进行计算
        */
        int x=2;//0000 0010
        int y=3;//0000 0011
        /*
            0000 0010
            0000 0011
           &---------
            0000 0010  =  2
        */
        System.out.println(x&y);

         /*
            0000 0010
            0000 0011
           |---------
            0000 0011  =  3
        */
        System.out.println(x|y);

         /*
            0000 0010
            0000 0011
           ^---------
            0000 0001  =  1
        */
        System.out.println(x^y);

        /*
            0000 0010  =2  右移1位  相当于/2
            0000 0001  =1
        */
        System.out.println(x>>1);//  2/2=1

        /*
            0000 0010 =2  左移1位  相当于*2
            0000 0100 =4
        */
        System.out.println(x<<1);//  2*2=4

        int z=128;
        /*
            1000 0000=128  右移一位,最高位无论0或1都用0补位
            0100 0000 =64
        */
        System.out.println(z>>>1);
    }
}
