package com.javabase.Day02;

public class BreakDemo {
    public static void main(String[] args) {
        /*
        break语句用于终止某个语句块的执行,强行退出
         */
        for (int i = 0; i < 7; i++) {
            if (i==5){
                break;
            }
            System.out.println("i="+i);
        }
        System.out.println("-------------------------");
        /*
        continue 用于终止某次循环过程,跳过continue下面的循环,开始下一次循环
         */
        for (int j = 0;  j< 7; j++) {
            if (j==5){
                continue;
            }
            System.out.println("j="+j);
        }
    }
}
