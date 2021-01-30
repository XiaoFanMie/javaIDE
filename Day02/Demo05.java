package com.javabase.Day02;

public class Demo05 {
    public static void main(String[] args) {
        /*
        赋值运算符=
            +=,-=,*=,/=,%=
        */
        short s=2;//s为short类型
        s=(short)(s+3);//s+3转换为int,不能赋值给short
        s+=3;//+=会自动转换数据类型

        /*
            区分== 和 = 的区别
        */
        boolean x=false;
        if (x=true){
            System.out.println("结果为真");

        }else{
            System.out.println("结果为假");
        }
    }
}
