package day1.lesson2;

import java.util.Scanner;

/**
 * 方法重载:
 *    在同一个类中,方法名相同,参数列表不同,与返回值类型无关
 *
 *    参数列表不同:
 *       参数个数不同;
 *       参数类型不同;
 *
 *
 */

public class main_demo7 {
    public static void main(String[] args) {
       int sum2 = getSum(1,2,3);
       int sum3 = getSum(1,2,3,4);
       int sum4 = getSum(1,2,3,4,5);

       System.out.println("sum1: " + getSum(1,2)); // int可以直接过渡到float
       System.out.println("sum2: " +sum2);
       System.out.println("sum3: " +sum3);
       System.out.println("sum4: " +sum4);
       System.out.println("sum5: " +getSum(1,2.0f));

    }

//    public static int getSum(int a, int b){
//        return  a+b;
//    }

    public static int getSum(int a, int b, int c){
        return  a+b+c;
    }
    public static int getSum(int a, int b, int c, int d){
        return  a+b+c+d;
    }
    public static int getSum(int a, int b, int c , int d, int e){
        return  a+b+c+d+e;
    }

    public static float getSum(int a, float b){
        return  a+b;
    }
}
