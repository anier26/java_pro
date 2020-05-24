package day1.lesson2;

import java.util.Scanner;

/**
 * 方法调用:
 *     有明确返回值的调用:
 *        单独调用: 一般来说没有意义;不推荐
 *        输出调用: 有意义但是不好,因为可能需要对结果进行进一步操作
 *        赋值调用: 推荐方案
 *
 *
 *     没有明确返回值的调用:
 *
 *
 */

public class main_demo6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的第一参数");
        int first = sc.nextInt();

        printStars(first);
    }

    private static void printStars(int first) {

       for (int y=1; y<=first; y++){
           for(int x=1; x<=y; x++){
//               System.out.print("*");
               System.out.print(x + "*" +y + "="+ x*y + "\t");
           }
           System.out.println();
       }

    }


}
