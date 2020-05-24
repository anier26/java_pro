package day1.lesson1;

import java.util.Scanner;

/**
 *
 *
 */

public class day13_demo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数据:");
        int shu = sc.nextInt();
        int ge = shu %10;
        int shi = shu /10%10;
        int bai = shu /10/10%10;

        if(ge*ge*ge +(shi*shi*shi) + (bai*bai*bai) == shu){
            System.out.println("水仙花数: " + shu);
        }
    }
}