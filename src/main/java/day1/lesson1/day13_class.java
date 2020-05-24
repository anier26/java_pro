package day1.lesson1;

import java.util.Scanner;

/**
 * for循环
 *
 */

public class day13_class {
    public static void main(String[] args){

        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int x=0; x<=100; x++){
            sum += x;
        }
        System.out.println("sum:" + sum);

        System.out.println("=============");

        for(int x=0; x<=100; x++){
            if (x %2 == 0){
                sum1 += x;
            }
        }
        System.out.println("sum1: " + sum1);
        System.out.println("=============");

        for(int x=0; x<=100; x++){
            if (x %2 == 1){
                sum2 += x;
            }
        }
        System.out.println("sum2: " + sum2);
    }

}