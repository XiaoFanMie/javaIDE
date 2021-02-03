package com.javabase.Others;

import java.util.Scanner;

public class chessBoard {
    static int[][] chBoard = new int[8][8];

    public static void Board(int tr,int td,int x,int y,int size) {
        if (size==1)return;
        int s=size/2;
        int title=0;
        title++;
        if ( x<tr+s && y<td+s){//方格在左上角
            Board(tr, td, x, y, size);
        }else{
            chBoard[tr+s-1][td+s-1]=title;
            Board(tr,td,tr+s-1,td+s-1,size);
        }

        if ( x<tr+s && y>=td+s){//方格在左下角
            Board(tr, td+s, x, y, size);
        }else{
            chBoard[tr+s-1][td+s]=title;
            Board(tr,td+s,tr+s-1,td+s,size);
        }


        if ( x>=tr+s && y<td+s){//方格在左上角
            Board(tr+s, td, x, y, size);
        }else{
            chBoard[tr+s][td+s-1]=title;
            Board(tr+s,td,tr+s,td+s-1,size);
        }

        if ( x>=tr+s && y>=td+s){//方格在左上角
            Board(tr+s, td+s, x, y, size);
        }else{
            chBoard[tr+s][td+s]=title;
            Board(tr+s,td+s,tr+s,td+s,size);
        }
    }

    public static void Print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        int k= input.nextInt();
        //int size=(int)Math.pow(2,k);
        Print(chBoard);
        //特殊方格位置
        int x= input.nextInt();
        int y= input.nextInt();
        Board(0,0,x,y,8);
        Print(chBoard);
    }
}
