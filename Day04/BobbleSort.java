package com.javabase.Day04;

import java.util.Arrays;

public class BobbleSort {
    public static void main(String[] args) {
        int[] a = {5, 7, 3, 4, 8, 2, 6};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println("第" + i + "次循环" + Arrays.toString(a));
        }
        System.out.println("从小到大" + Arrays.toString(a));
    }
}
        /*for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("从大到小"+Arrays.toString(a));
    }*/

