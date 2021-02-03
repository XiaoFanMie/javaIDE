package com.javabase.Others;

import java.util.Arrays;
import java.util.Scanner;

public class Shu {

     /*   public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            int x=input.nextInt();
            int y=input.nextInt();
            int [][] a=new int [x+2][y];
            for(int i=0;i<x+2;i++){
                for(int j=0;j<y;j++){
                    int num=input.nextInt();
                    a [i] [j]=num;
                }
            }
            int b=0;
            int c=0;
            int d=0;
            for(int k=0;k<3;k++){
                for(int l=0;l<6;l++){
                    if(k==0&&a[2+k][l]==a[1][l]){
                        b=b+a[0][l];
                    }
                    if(k==1&&a[2+k][l]==a[1][l]){
                        c=c+a[0][l];
                    }
                    if(k==2&&a[2+k][l]==a[1][l]){
                        d=d+a[0][l];
                    }
                }
            }
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }*/
    /* public int[] twoSum(int[] nums, int target) {
         int [] num = {2,7,11,15};
         int t=9;
         for(int i=0;i<num.length;i++){
             for(int j=1;j<num.length;j++){
                 if(num[i]+num[j]==t){
                     System.out.println(i+j);
                 }
             }
         }
         return ;*/
      /*  public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            int x=input.nextInt();
            int y=input.nextInt();
            int [][] a=new int [x+2][y];
            for(int i=0;i<x+2;i++){
                for(int j=0;j<y;j++){
                    int num=input.nextInt();
                    a [i] [j]=num;
                }
            }
            int b=0;
            int c=0;
            int d=0;
            for(int k=0;k<3;k++){
                for(int l=0;l<6;l++){
                    if(k==0&&a[2+k][l]==a[1][l]){
                        b=b+a[0][l];
                    }
                    if(k==1&&a[2+k][l]==a[1][l]){
                        c=c+a[0][l];
                    }
                    if(k==2&&a[2+k][l]==a[1][l]){
                        d=d+a[0][l];
                    }
                }
            }
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }*/
    /* public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int m= input.nextInt();
         int n= input.nextInt();
         int flag=1;
         if (n%2==0){
             flag=0;
         }
         for (int i = 0; i < n/2; i++) {
             m*=2;
         }
         System.out.print(flag+" ");
         System.out.print(m);
     }*/
     /*public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int x= input.nextInt();
         int sum=1;
         int p
         while (true){
             if (p ||  sum/x)
             sum=sum*10+1;
             int s=sum%x;

         }

     }*/
     /*public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         int Price = input.nextInt();
         int Z= input.nextInt();
         double Money=Price*0.1*Z;
         System.out.format("%.2f",Money);
     }*/
 /*    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int N= input.nextInt();
         int [] num = new int[N];
         int j=0,k=0;
         for (int i = 0; i < N; i++) {
             num[i]= input.nextInt();
             if (num[i]%2==0){
                j++;
             }else k++;
         }
         System.out.println(k+" "+j);
     }*/
/*
     public static void main(String[] args) {

         Scanner input=new Scanner(System.in);
         int x=input.nextInt();
         int y=input.nextInt();
         int [][] a=new int [x+2][y];
         for(int i=0;i<x+2;i++){
             for(int j=0;j<y;j++){
                 int num=input.nextInt();
                 a [i] [j]=num;
             }
         }
         int b=0;
         int c=0;
         int d=0;
         for(int k=0;k<3;k++){
             for(int l=0;l<6;l++){
                 if(k==0&&a[2+k][l]==a[1][l]){
                     b=b+a[0][l];
                 }
                 if(k==1&&a[2+k][l]==a[1][l]){
                     c=c+a[0][l];
                 }
                 if(k==2&&a[2+k][l]==a[1][l]){
                     d=d+a[0][l];
                 }
             }
         }
         System.out.println((int)b);
         System.out.println(c);
         System.out.print(d);
     }
*/
    /* public static void main(String[] args) {
         int[] a = {9, 5, 1, 4, 2, 3, 6, 7};
         int c;
         for (int i = 0; i < a.length - 1; i++) {
             c = a[i + 1];
             int p = i;
             while (p >= 0 && c < a[p]) {
                 a[p + 1] = a[p];
                 p--;
             }
             a[p + 1] = c;
         }
         System.out.println(Arrays.toString(a));
     }*/
     /*public static void main(String[] args) {
         int [] a= new int[]{9,8,7,6,5,4,3,2,1,0};
         for (int i = 0; i < a.length-1; i++) {
          int c=a[i+1];
          int p=i;
          while (p>=0&&c<a[p]){
              a[p+1]=a[p];
              p--;
          }
          a[p+1]=c;
             System.out.println(Arrays.toString(a));
         }
     }*/

    /*public static void main(String[] args) {
        int [] Arr = new int[]{7,5,3,4,8,2,0,1,9};

        //BobbleSort
        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = 0; j <Arr.length-i-1; j++) {
                if (Arr[j]>Arr[j+1]){
                    int temp=Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]=temp;
                }
            }
        }
        System.out.println("冒泡"+Arrays.toString(Arr));
        System.out.println("------------------------------------");

        for (int i = 0; i < Arr.length - 1; i++) {
            int minIndex=i;
            for (int j = i; j <Arr.length-i-1 ; j++) {
                if (Arr[j]<Arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=Arr[minIndex];
            Arr[minIndex]=Arr[i];
            Arr[i]=temp;
        }
        System.out.println("选择"+Arrays.toString(Arr));
        System.out.println("------------------------------------");

        for (int i = 0; i < Arr.length-1; i++) {
            int c=Arr[i+1];
            int p=i;
            while (p>=0 && Arr[p]>Arr[p+1]){
                Arr[p+1]=Arr[p];
                p--;
            }
            Arr[p+1]=c;
        }
        System.out.println("插入"+Arrays.toString(Arr));
    }*/

}










