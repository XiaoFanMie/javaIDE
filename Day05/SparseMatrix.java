package com.javabase.Day05;

/**
 * @author 17509
 */
public class SparseMatrix {
    public static void main(String[] args) {
        int[][] a = new int[15][15];
        a[0][1] = 1;
        a[1][1] = 2;
        a[1][4] = 2;
        /*
         * 记录有效数字个数
         * */
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    sum++;
                }
            }
        }

        /*稀疏数组*/
        int[][] Matrix = new int[sum + 1][3];
        Matrix[0][0] = 15;
        Matrix[0][1] = 15;
        Matrix[0][2] = sum;

        int index=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    Matrix [index][0]=i;
                    Matrix [index][1]=j;
                    Matrix [index][2]=a[i][j];
                    index++;
                }
            }
        }
        /*遍历输出*/
        System.out.println("输出稀疏矩阵");
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j]+"\t");
            }
            System.out.println();
        }

        /*稀疏数组转二维数组*/
        int [] [] b = new int[Matrix[0][0]][Matrix[0][1]];
        for (int i = 1; i < Matrix.length; i++) {
            b[Matrix[i][0]][Matrix[i][1]]=Matrix[i][2];
        }
        /*
        遍历输出
         */
        System.out.println("输出转化后的二维矩阵");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
    }
}