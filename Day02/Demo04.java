package com.javabase.Day02;

public class Demo04 {
    public static void main(String[] args) {
        /*
        逻辑运算符
            &逻辑与    |逻辑或    ^异或     (还可以进行位运算)
            &&短路与   ||短路或   !逻辑非
        */
        /*
            &和&& 有false则为false
            | 和 || 有true则为true
        */
        int a=5;
        int b=10;
        int c=15;
        System.out.println(a<b & b<c);//true & true = true
        System.out.println(a>b & ++b<c);//false & true =flase
        System.out.println(b);
        System.out.println("-------------------");
        /*
        * 逻辑与& 和 短路与&& 区别在于
        * 逻辑与会将两边的运算都会进行运算
        * 短路与 如果第一个运算结果为false ,则会短路，后面的表达式不执行
        * 逻辑或| 和 短路或|| 区别于其相同
        * */
        int a1=5;
        int b1=10;
        int c1=15;
        System.out.println(a1<b1 && b1<c1);//true && true = true
        System.out.println(a1>b1 && ++b1<c1);//false && true =flase
        System.out.println(b1);
        System.out.println("-------------------");


        boolean x=true;
        System.out.println(!x);//结果取反
        System.out.println("-------------------");


        int m=5;
        int n=10;
        System.out.println(m>n ^ n>m);//相异为true
        System.out.println(m>n ^ n<m);//相同为false
    }
}
