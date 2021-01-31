package com.javabase.Day03;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo01 {
    /* Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n= input.nextInt();

        Demo01 s=new Demo01();
        int k= s.getMax(m,n);
        System.out.println(k);

            s.Text();
        System.out.println(s.Text());


        s.Moth();

        s.Te(m,n);
        System.out.println(s.Te(m,n));
    }
    public int getMax(int x,int y){
        int Max;
        if (x>y){
             Max=x;
        }else{
            Max=y;
        }
        return Max;
    }

    public String Text(){
        System.out.println("abc1");
        return "abc2";
    }

    public void Moth(){
        for (int i=0;;i++){
            if (i==500){
                return;
            }
        }
    }

    public boolean Te(int x , int y){
        if (x>y){
            return true;
        }else{
            return false;
        }
    }*/
    /*public static void main(String[] args){
            show(0);
            show(1);
        }

        public static void show(int i){
            switch(i){
                default:
                    i+=2;
                case 1:
                    i+=1;
                case 4:
                    i+=8;
                case 2:
                    i+=4;
            }
            System.out.println("i="+i);
        }*/
    /*    public static void main(String[] args) {
          show(9);
    }
    public static void show(int s){
        for (int i = 1; i <=s; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }*/
    /* public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           int i= input.nextInt();
           Xing(i);
       }

       public static void Xing(int i){
           for (int j = 0; j < i; j++) {
               for (int k = 0; k < i; k++) {
                   System.out.print("*");
               }
               System.out.println();
           }
       }*/
    /* public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           int x= input.nextInt();
           int y= input.nextInt();
           int z= input.nextInt();
           System.out.println(Max(x,y,z));
       }


    public static int Max(int x,int y,int z) {
    if (x>y){
        if(x>z){
            return x;
        }else{
            return z;
        }
    }
    if(x<y){
        if (y>z){
            return y;
        }else{
            return z;
        }
    }
return 0;
 }*/
    /*public static void main(String[] args) {
           String s = "I Love GPLT";
           for (int i = 0; i < s.length(); i++) {
               System.out.print(s.charAt(i));
               if (i<s.length()-1)
               System.out.println();
           }
       }*/
    /*public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           int X=input.nextInt();
           int s,n,t=1;
           for (int i = 0; i < X; i++) {
               t=t*10+1;
           }
       }*/
    public static void main(String[] args) {
        /*
        数组
            一组数据类型相同的元素集合
         数组是引用类型（对象）
         数组中可以存储基本类型，也可以存储引用类型
         */

        /*
        数组的声明
            数据类型 [] 数组名 ； eg:int [] a;
            数据类型 [] 数组名；    eg: int a [];
            int 标识数组中的元素为int类型
            尽量使用第一种命名方式
        int [] a,d;//a,d都是数组
        int b [],c;//b是数组 c是变量
         */

        /*数组的创建*/
        /*
            new 数据类型[长度];
            java 中的数组在创建时必须给定其长度
            长度一旦给定，不可更改
            new int[5];表示在内存中找一块长度为5的连续空间，每一个空间都有初始值，int：0；
        */
        int [] a = new int [5];
        System.out.println(Arrays.toString(a));
        System.out.println("-------------------------");
        //String 类型默认初始值 null
        String [] b = new String[]{"a","b","c","d"};
        System.out.println(Arrays.toString(b));
        System.out.println("-------------------------");
        //char 类型默认初始值为空
        char [] e = new char[]{'e','f','g','h'};
        System.out.println(Arrays.toString(e));
        System.out.println("-------------------------");

        //创建时直接赋值
        int [] c = new int[]{1,2,3};
        System.out.println(Arrays.toString(c));
        int [] d = {4,5,6};
        System.out.println(Arrays.toString(d));

    }
}

