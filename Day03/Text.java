<<<<<<< HEAD
package com.javabase.Day03;

import java.util.Arrays;
import java.util.Scanner;

public class Text {
   /* public static void main(String[] args) {
            String [] s =new String[]{"I"," ","L","o","v","e"," ","G","P","L","T"};
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
    }*/
    //定义一个长度为10的int数组,统计数组中的总和、平均值、最大值、最小值、以及奇数和偶数的个数
   /*public static void main(String[] args) {
       int [] a=new int[10];
       Scanner input=new Scanner(System.in);
       for (int k=0;k<10;k++){
           int t= input.nextInt();
           a[k]=t;
       }

       int avg=0,max=0,min=0,j=0,d=0;
       int [] c = Array(a);
       for (int i = 0; i < 10; i++) {
           System.out.print(c[i]+"\t");
       }
       System.out.println();
       System.out.println("总和"+Sum(c));
       System.out.println("平均值"+(double)Sum(c)*1.0/10);
       System.out.println("最大值"+c[9]);
       System.out.println("最小值"+c[0]);
       System.out.println("奇数个数"+jSum(c));
       System.out.println("偶数个数"+dSum(c));
   }

   public static int[] Array(int [] a){
       if (a.length==0)
           return a;
       for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a.length-1-i; j++) {
               if (a[j]>a[j+1]){
                   int temp=a[j+1];
                   a[j+1]=a[j];
                   a[j]=temp;
               }
           }
       }
       return a;
   }
   public static int Sum(int [] c){
       int s=0;
       for (int i=0;i<c.length;i++){
           s+=c[i];
       }
       return s;
   }
    public static int jSum(int [] c){
        int j=0;
        for (int i=0;i<c.length;i++){
            if (c[i]%2!=0){
                j++;
            }
        }
        return j;
    }
    public static int dSum(int [] c){
        int d=0;
        for (int i=0;i<c.length;i++){
            if (c[i]%2==0){
                d++;
            }
        }
        return d;
    }*/
    //10个评委打分，去掉一个最高分，去掉一个最低分，然后计算该选手的平均分
   /*public static void main(String[] args) {
       int [] a= new int[10];
       Scanner input=new Scanner(System.in);
       for (int i = 0; i < 10; i++) {
           int t= input.nextInt();
           a[i]=t;
       }
       Array(a);
       int sum=0;
       for (int i = 1; i < a.length-1; i++) {
           sum+=a[i];
       }
       System.out.println("去掉一个最高分"+a[a.length-1] +"去掉一个最低分"+a[0]+"最后平均分"+(double)sum*1.0/8);
   }
    public static int [] Array(int [] a) {
        if (a.length==0){
            return a;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }*/
    //交换元素
   /* public static void main(String[] args) {
        int [] a= { 5, 11, 15, 24, 36, 47, 59, 66,3 };
        int [] b=new int[a.length];
        int j=0;
        for (int i = a.length-1; i >=0; i--) {
            b[j]=a[i];
            j++;
        }
        System.out.println(Arrays.toString(b));
    }*/
    //要求将以上数组中的0项去掉，将不为0的值存入一个新的数组
  /* public static void main(String[] args) {
       int o[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
       int j=0;
       for (int i = 0; i < o.length; i++) {
           if (o[i]!=0){
               j++;
           }
       }
       int n [] = new int[j];
       j=0;
       for (int i = 0; i < o.length; i++) {
           if (o[i]!=0){
               n[j]=o[i];
               j++;
           }
       }
       System.out.println(Arrays.toString(n));
   }*/
    //选择排序法
   /*public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int  [] a = new int [10];
       for (int i = 0; i < a.length; i++) {
           a[i]= input.nextInt();
       }
       for (int i = 0; i < a.length; i++) {
           int minIndex=i;
           for (int j = i; j < a.length; j++) {
               if (a[j]<a[minIndex]){
                   minIndex=j;
               }
               int temp=a[minIndex];
               a[minIndex]=a[i];
               a[i]=temp;
           }
       }
       System.out.println(Arrays.toString(a));
   }*/

}
=======
package com.javabase.Day03;

import java.util.Arrays;
import java.util.Scanner;

public class Text {
   /* public static void main(String[] args) {
            String [] s =new String[]{"I"," ","L","o","v","e"," ","G","P","L","T"};
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
    }*/
    //定义一个长度为10的int数组,统计数组中的总和、平均值、最大值、最小值、以及奇数和偶数的个数
   /*public static void main(String[] args) {
       int [] a=new int[10];
       Scanner input=new Scanner(System.in);
       for (int k=0;k<10;k++){
           int t= input.nextInt();
           a[k]=t;
       }

       int avg=0,max=0,min=0,j=0,d=0;
       int [] c = Array(a);
       for (int i = 0; i < 10; i++) {
           System.out.print(c[i]+"\t");
       }
       System.out.println();
       System.out.println("总和"+Sum(c));
       System.out.println("平均值"+(double)Sum(c)*1.0/10);
       System.out.println("最大值"+c[9]);
       System.out.println("最小值"+c[0]);
       System.out.println("奇数个数"+jSum(c));
       System.out.println("偶数个数"+dSum(c));
   }

   public static int[] Array(int [] a){
       if (a.length==0)
           return a;
       for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a.length-1-i; j++) {
               if (a[j]>a[j+1]){
                   int temp=a[j+1];
                   a[j+1]=a[j];
                   a[j]=temp;
               }
           }
       }
       return a;
   }
   public static int Sum(int [] c){
       int s=0;
       for (int i=0;i<c.length;i++){
           s+=c[i];
       }
       return s;
   }
    public static int jSum(int [] c){
        int j=0;
        for (int i=0;i<c.length;i++){
            if (c[i]%2!=0){
                j++;
            }
        }
        return j;
    }
    public static int dSum(int [] c){
        int d=0;
        for (int i=0;i<c.length;i++){
            if (c[i]%2==0){
                d++;
            }
        }
        return d;
    }*/
    //10个评委打分，去掉一个最高分，去掉一个最低分，然后计算该选手的平均分
   /*public static void main(String[] args) {
       int [] a= new int[10];
       Scanner input=new Scanner(System.in);
       for (int i = 0; i < 10; i++) {
           int t= input.nextInt();
           a[i]=t;
       }
       Array(a);
       int sum=0;
       for (int i = 1; i < a.length-1; i++) {
           sum+=a[i];
       }
       System.out.println("去掉一个最高分"+a[a.length-1] +"去掉一个最低分"+a[0]+"最后平均分"+(double)sum*1.0/8);
   }
    public static int [] Array(int [] a) {
        if (a.length==0){
            return a;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }*/
    //交换元素
   /* public static void main(String[] args) {
        int [] a= { 5, 11, 15, 24, 36, 47, 59, 66,3 };
        int [] b=new int[a.length];
        int j=0;
        for (int i = a.length-1; i >=0; i--) {
            b[j]=a[i];
            j++;
        }
        System.out.println(Arrays.toString(b));
    }*/
    //要求将以上数组中的0项去掉，将不为0的值存入一个新的数组
  /* public static void main(String[] args) {
       int o[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
       int j=0;
       for (int i = 0; i < o.length; i++) {
           if (o[i]!=0){
               j++;
           }
       }
       int n [] = new int[j];
       j=0;
       for (int i = 0; i < o.length; i++) {
           if (o[i]!=0){
               n[j]=o[i];
               j++;
           }
       }
       System.out.println(Arrays.toString(n));
   }*/
    //选择排序法
   /*public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int  [] a = new int [10];
       for (int i = 0; i < a.length; i++) {
           a[i]= input.nextInt();
       }
       for (int i = 0; i < a.length; i++) {
           int minIndex=i;
           for (int j = i; j < a.length; j++) {
               if (a[j]<a[minIndex]){
                   minIndex=j;
               }
               int temp=a[minIndex];
               a[minIndex]=a[i];
               a[i]=temp;
           }
       }
       System.out.println(Arrays.toString(a));
   }*/

}
>>>>>>> 1b1784a18a0a307f49e77a3f4df8ee384bfab1dc
