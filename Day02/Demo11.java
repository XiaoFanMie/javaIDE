package com.javabase.Day02;

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        /*
        do while 先执行后判断
         */
        int i=0;
        do{
            Scanner input=new Scanner(System.in);
            int s=input.nextInt();
            ++i;
        }while(i<5);
    }
}
