<<<<<<< HEAD
package com.javabase.Day02;

public class Demo09 {
    public static void main(String[] args) {
        /*
            case后的值只能是使用常量表达式
            case的value不能重复
            case后没有break,则会继续执行下一个case语句
            如果没有找到对应的case值,则会执行default后面的语句

            如果具体数值不多,使用switch语句效率高
        */
        int s = 2;
        if (1 <= s && s <= 7) {
            switch (s) {
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
            }
        } else {
            System.out.println("错误");
        }

    }
=======
package com.javabase.Day02;

public class Demo09 {
    public static void main(String[] args) {
        /*
            case后的值只能是使用常量表达式
            case的value不能重复
            case后没有break,则会继续执行下一个case语句
            如果没有找到对应的case值,则会执行default后面的语句

            如果具体数值不多,使用switch语句效率高
        */
        int s = 2;
        if (1 <= s && s <= 7) {
            switch (s) {
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
            }
        } else {
            System.out.println("错误");
        }

    }
>>>>>>> 0042efad71ba7ca2359d61a73d12e1cb104b5be5
}