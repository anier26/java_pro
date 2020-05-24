package day1.lesson1;

import java.util.Scanner;

/**
 *
 * switch 选择结构
 *
 * switch(表达式){  --- >> switch后跟需要比较的表达式
 *      case 值1:
 *          语句体1;
 *          break;
 *      case 值2:
 *          语句体2:
 *          break;
 *      ...
 *
 *      default:
 *          语句体n+1;
 *          break;
 *
 * 注意:
 *    case 后面的值只能是常量,不能是变量,且多个case后面的值不能出现相同
 *
 *
 *
 * 格式的解释:
 *   switch  ---- >> switch 选择结构
 *   表达式:  ---- >> 取值有限定
 *   byte short int char,枚举,String
 *
 *   case 后跟要和表达式比较的值
 *   语句体: 要执行的代码
 *   break: 表示中断结束的意思,可以控制switch语句的结束
 *   default: 当所有的值都和表达式不匹配的时候,就执行default控制语句
 *
 * }
 *
 */

public class day12_class {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你想要的星期数");
        int week = sc.nextInt();

        switch (week){
            case 1:
                System.out.println("输入的星期数是1");
                break;
            case 2:
                System.out.println("输入的星期数是2");
                break;
            case 3:
                System.out.println("输入的星期数是3");
                break;
            case 4:
                System.out.println("输入的星期数是4");
                break;
            case 5:
                System.out.println("输入的星期数是5");
                break;
            case 6:
                System.out.println("输入的星期数是6");
                break;
            case 7:
                System.out.println("输入的星期数是7");
                break;
            default:
                System.out.println("输入有误");
                break;
        }

    }
}