package com.javabase.Day04;

import java.util.Arrays;

/**
 * @author 17509
 */
public class ArrayDemo {
    public static void main(String[] args) {
        /*
            二位数组
         */
        int[][] a = new int[3][3];

        int[][] b = new int[3][];
        b[0] = new int[5];
        b[1] = new int[4];
        b[2] = new int[]{1, 5, 9};
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(b[1]));
        System.out.println(Arrays.toString(b[2]));

        int[][] c = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
        int[][] d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < d.length; i++) {
            System.out.println(Arrays.toString(d[i]));
        }
    }
}
