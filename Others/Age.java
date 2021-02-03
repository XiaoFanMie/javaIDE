package com.javabase.Others;
import java.util.Scanner;
public class Age {
    /* public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int age= input.nextInt();
         int f=age/10;
         String [] a=new String[]{"儿童","少年","青少年","青年","壮年","中年","中老年","老年","老老年","老老老老年"};
         System.out.println(a[f]);
     }*/
    public static void main(String[] args) {
        String[][] a = new String[15][15];
        Scanner input = new Scanner(System.in);
        String[] num = {"⒈", "⒉", "⒊", "⒋", "⒌", "⒍", "⒎", "⒏", "⒐", "⒑", "⒒", "⒓", "⒔", "⒕", "⒖"};
        /*
        * 初始化棋盘
        * */
        intiQP(a,num);

        int flag = 1;
        while (true) {
            System.out.println(((flag == 1) ? "白" : "黑") + "子下棋");
            System.out.println("请输入你要下的位置");
            int x = input.nextInt();
            int y = input.nextInt();
            if (a[x - 1][y - 1] == "♘" || a[x - 1][y - 1] == "♞" || x>a.length || y>a.length || x<0 || y<0) {
                System.out.println("地址有误");
                continue;
            }
            if (flag == 1) {
                a[x - 1][y - 1] = "♘";
                flag = 0;
            } else {
                a[x - 1][y - 1] = "♞";
                flag = 1;
            }
            /*
            *判断输赢
            * */
            if (isWin(a)==0){
                System.out.println("白棋赢");
                break;
            }
            if (isWin(a)==1){
                System.out.println("黑棋赢");
                break;
            }
            /*
            * 更新棋盘
            * */
            PrintQp(a);

        }
    }

    /**
     * 创建棋盘
    */
    public static void intiQP(String [][] a , String [] num) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = "十";
                if (j == (a.length - 1)) {
                    a[i][j] = num[i];
                }
                if (i == (a.length - 1)) {
                    a[i][j] = num[j];
                }
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    /**
    *打印棋盘
     */
    public static void PrintQp(String [][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    /**
    *判断谁赢
    */
    public static int isWin(String [] [] a) {

        //判断行
        for (int i = 0; i < a.length-4; i++) {
            for (int j = 0; j < a.length-4; j++) {
                if (a[i][j]=="十") {continue;}
                if (a[i][j]==a[i][j+1] & a[i][j]==a[i][j+2] & a[i][j]==a[i][j+3] & a[i][j]==a[i][j+4])
                {
                    if (a[i][j]=="♘"){
                        return 0;
                    }else if(a[i][j]=="♞"){
                    return 1;
                    }
                }
            }
        }

        //判断列
        for (int i = 0; i < a.length-4; i++) {
            for (int j = 0; j < a.length-4; j++) {
                if (a[i][j]=="十") {continue;}
                if (a[i][j]==a[i+1][j] & a[i][j]==a[i+2][j] & a[i][j]==a[i+3][j] & a[i][j]==a[i+4][j])
                {
                    if (a[i][j]=="♘"){
                        return 0;
                    }else if(a[i][j]=="♞"){
                        return 1;
                    }
                }
            }
        }

        //判断正对角
        for (int i = 0; i < a.length-4; i++) {
            for (int j = 0; j < a.length-4; j++) {
                if (a[i][j]=="十") {continue;}
                if (a[i][j]==a[i+1][j+1] & a[i][j]==a[i+2][j+2] & a[i][j]==a[i+3][j+3] & a[i][j]==a[i+4][j+4])
                {
                    if (a[i][j]=="♘"){
                        return 0;
                    }else if(a[i][j]=="♞"){
                        return 1;
                    }
                }
            }
        }

        //判断反对角
        for (int i = a.length-1; i > 4; i--) {
            for (int j = 0; j <a.length-4; j++) {
                if (a[i][j]=="十") {continue;}
                if (a[i][j]==a[i-1][j+1]  & a[i][j]==a[i-2][j+2] & a[i][j]==a[i-3][j+3] & a[i][j]==a[i-4][j+4])
                {
                    if (a[i][j]=="♘"){
                        return 0;
                    }else if(a[i][j]=="♞"){
                        return 1;
                    }
                }
            }
        }
        return 3;
    }
}
