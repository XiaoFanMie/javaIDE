package com.javabase.Day03;

public class Demo03 {
    public static void main(String[] args) {
        /*
        数组的遍历/迭代
        访问数组中的每一个元素并输出
         */
        int [] a= new int[]{1,2,3,4};
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("--------------------");

        /*
            增强for(for each循环)
            定义一个int类型的数组类接收数组a中的元素
         */
        int [] b = new int []{4,5,6};
        for (int temp:b) {
            System.out.println(temp);
        }
    }
}
