package com.javabase.Day02;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class LianXi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Y=input.nextInt();
        int M=input.nextInt();
        int D=input.nextInt();
        int count;
        if (Y%4==0&&Y%100!=0){
            if (M-1>2){
                count=30*(M-2)+28+D;
                System.out.println("今天是"+Y+"年的第"+count+"天");
            }else{
                count=30*(M-1)+D;
                System.out.println("今天是"+Y+"年的第"+count+"天");
            }
        }
        else{
            if (M-1>2){
                count=30*(M-2)+29+D;
                System.out.println("今天是"+Y+"年的第"+count+"天");
            }else{
                count=30*(M-1)+D;
                System.out.println("今天是"+Y+"年的第"+count+"天");
            }
        }
    }


}
