package com.javabase.Day04;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int [] a = {7,5,3,4,8,2};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length ; j++) {
                if (a[i]>a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
            System.out.println("第"+(i+1)+"次排序结果"+ Arrays.toString(a));
        }
        System.out.println("最终结果"+Arrays.toString(a));

        System.out.println("------------------------------------------------------------");

        int [] b = {7,5,3,4,8,2};
        for (int i = 0; i < b.length - 1; i++) {
            int minIndex=i;//标记第i位为最小值
            for (int j = i; j < b.length ; j++) {
                if (b[minIndex]>b[j]){
                   minIndex=j;
                }
            }
            int temp=b[minIndex];
            b[minIndex]=b[i];
            b[i]=temp;
            System.out.println("第"+(i+1)+"次排序结果"+ Arrays.toString(b));
        }
        System.out.println("最终结果"+Arrays.toString(b));
    }
}
