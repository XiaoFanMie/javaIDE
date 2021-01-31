<<<<<<< HEAD
package com.javabase.Day02;

public class Demo13 {
    public static void main(String[] args) {
        /*
        嵌套循环
         */
       /* for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }*/
        for (int i = 0; i < 5; i++) {
            /*
            设置标记点,通过语句 break 标记点;
            调到对应的标记处继续执行
             */
            a:for (int j = 0; j < 5; j++) {
                if(j==3){
                    break a;
                }
                System.out.print("j="+j+"\t");
            }
            System.out.println("i="+i);
        }
    }
}
=======
package com.javabase.Day02;

public class Demo13 {
    public static void main(String[] args) {
        /*
        嵌套循环
         */
       /* for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }*/
        for (int i = 0; i < 5; i++) {
            /*
            设置标记点,通过语句 break 标记点;
            调到对应的标记处继续执行
             */
            a:for (int j = 0; j < 5; j++) {
                if(j==3){
                    break a;
                }
                System.out.print("j="+j+"\t");
            }
            System.out.println("i="+i);
        }
    }
}
>>>>>>> 0042efad71ba7ca2359d61a73d12e1cb104b5be5
