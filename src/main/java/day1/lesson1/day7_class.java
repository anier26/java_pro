package day1.lesson1;

/**
 * 字符串数据和其他数据类型做+,结果是字符串类型,这里的加号做字符串连接符使用
 * ++ /-- 对变量进行自增1或者自减1
 *
 * 单独使用:放前放后都一样
 * 参与运算使用:
 *
 *
 */

public class day7_class {
    public static void main(String[] args){
//       int a=10;
//       int b=20;
//        System.out.println("helloworld");
//        System.out.println("hello"+"world");//helloworld
//        System.out.println("5+5="+5+5);//5+5=55
//        System.out.println("5+5="+(5+5));//5+5=10
//        System.out.println('a'+5+5);//107
//        System.out.println("hello"+5+'a');//hello5a
//        System.out.println("hello"+'a'+5); //helloa5v字符串和字符+就是做拼接
//        System.out.println(a+"+"+b+"="+(a+b)); //10+20=30


        int x = 3;
        int y = 5;

        //单独使用++/--放前放后都一样
//        System.out.println(x++);
//        System.out.println(++y);


        int a = x++;  //参与运算时,++在后面表示先赋值在++  所以a=3,x=4
        int b = --y;  //--在前面,表示先自减1在赋值, 所以b=4,y=4

        System.out.println("a: " + a);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("b: " + b);

        int[] arr = new int[3];
        String[] str = {"hello","world","java"};


    }
}