package day1.lesson1;

import java.util.Scanner;

/**
 * 求5的阶乘
 */

public class day12_demo2 {
    public static void main(String[] args){
        int sum = 1;
        for(int x=1; x<=5; x++){
            sum *= x;
        }
        System.out.println("sum: " +sum);
    }
}