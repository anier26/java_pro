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

public class day7_demo {
    public static void main(String[] args){
       int a=10;
       int b=10;
       int c=10;

       a = b++; //a=10, b=11, c=10
       c = --a; //c=9,a=9,b=11
       b = ++a; // c=9,a=10,b=10
       a = c--; // b=10,a=9,c=8


        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);


        int x=4;
        //要把三个表达式对应的y值算出来
        int y=(x++)+(++x)+(x*10); // y=4, x=5,x=6,y=6,x*10=60, y=4+6+60

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}