package day1.lesson1;

import java.util.Scanner;

/**
 * 三目运算符:
 *    格式:比较表达式?表达式1:表达式2;
 *    执行结果:
 *       根据比较表达式结果返回值,true 或false 来决定执行表达式1或者2
 *       如果是true --- >> 执行表达式1;
 *       如果是false --- >> 执行表达式2;
 *
 */


public class day10_demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要比较的值: ");
        int first = sc.nextInt();

        System.out.println("请输入要比较的值: ");
        int sec = sc.nextInt();

        int max = (first>sec)? first:sec;
        System.out.println("max: " + max);


    }
}