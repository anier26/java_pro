package day1.lesson1;

/**
 *  实现两个整数变量的交换
 *
 */

public class day9_demo {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        //方式一:
//        int tmp = a;
//        a=b;
//        b=tmp;
//
//        System.out.println("a: " + a + ",b: " + b);
//
        //方式二: 亦或^
        System.out.println("===================");
//
//        a=a^b;
//        b=a^b; // b = a^b^b; === > b=a;
//        a=a^b; // a = a^b^a  === > a=b;



        b=(a+b)-(a=b);

        System.out.println("a: " + a + ",b: " + b);


    }
}