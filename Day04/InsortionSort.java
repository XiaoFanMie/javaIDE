package com.javabase.Day04;

import java.util.Arrays;

public class InsortionSort {
    public static void main(String[] args) {
        int [] a = {9,8,7,6,5,4,3,2,1,0};
        for (int i = 0; i < a.length-1; i++) {
            int current = a[i+1];
            int p=i;
            while(p>=0&&a[p]>current){
                a[p+1]=a[p];
                p--;
            }
            a[p+1]=current;
            System.out.println(Arrays.toString(a));
        }
    }
}
