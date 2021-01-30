package com.javabase.Day02;

public class Demo06 {
    public static void main(String[] args) {
        /*
            条件运算符(三目运算符)
            (条件表达式)?表达式1:表达式2
            判断条件表达式的正确与否
            若为真则将表达式1赋值给s,若为假则将表达式2赋值给s

            条件语句与if-else的联系与区别
                1.条件语句可以简化为if-else 语句
                2.条件运算符要求必须返回一个结果
                3.if可以有多个语句
        */
        boolean s= 1>2? true:false;
        System.out.println(s);

    }
}
