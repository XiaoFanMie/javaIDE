package com.javabase.Day01;

public class Demo04 {
    public static void main(String[] args) {
         /*
         char字符型 表示一个字符 使用单引号表示
        * 2字节*/
         /*
        计算机中如何显示字符？计算机中所有的数据均为为二进制存储
        通过人为定义的编码解决：
            最早的是美国人指定的Ascii表
            后来：GBK GB2312
         为了将全球文字纳入：Unicode编码 采用二进制存储
         它是Java底层存储字符使用的编码方式

         UTF-8 为了在文件存储，网络传输
            特点时长度可变，英文是1字节 中文是3字节
         */
         /*
        char类型可以参与算术运算，使用的是字符在码表中的十进制数
         */
        char c=97;//a在码表中是97
        char c1='重';
        char c2='\n';
        System.out.println(c);
        System.out.println(c-5);
        System.out.println(c1);
        System.out.println(c2);

    }
}
