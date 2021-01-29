package com.javabase.Day01;

public class Demo02 {
    public static void main(String[] args) {
        /*
         java数据类型分为基本数据类型和引用数据类型
         java提供8中基本类型，便于操作
         直接使用关键字声明，结构简单
         */

        /*byte类型   1字节 从-128~127*/
        byte B=127;
        /*short类型  2字节 */
        short S=127;
        /*int类型   4字节 */
        int  i=2147483647;
        /*long类型   8字节 */
        long L=2147483648L;

        /*
        0b开头为二进制数
        */
        int x=0b10;
        System.out.println("x="+x);

        /*
        0开头的为八进制数
         */
        int y=012;
        System.out.println("y="+y);

        /*
        0x开头为二进制数
        */
        int z=0x19;
        System.out.println("z="+z);
    }
}
