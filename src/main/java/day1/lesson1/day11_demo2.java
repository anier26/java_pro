package day1.lesson1;

import java.util.Scanner;

/**
 * 控制语句:
 *     顺序结构  ---->> 从上到下, 依次执行
 *     选择结构
 *          if 选择结构 --->>三元都可以用if改,但是if不一定都能用三元改
 *                          如果执行结果是一个赋值操作,则可以改
 *              格式一:
 *                  if(比较表达式:){
 *                      语句体;
 *                  }
 *
 *              格式二:  --->> 如果if语句的执行结果是输出语句,那么就不能用三元改进,如果执行结果是一个赋值操作,则可以改
 *                  if(比较表达式){
 *                      语句体1;
 *                  }esls{
 *                      语句体2;
 *                  }
 *
 *              格式三:
 *                  if(比较表达式1){
 *                      语句体1;
 *                  }else if(比较表达式2){
 *                      语句体2;
 *                  }else if(比较表达式3){
 *                      语句体3;
 *                  }
 *                  ...
 *                  else{
 *                      语句体n+1;
 *                  }
 *
 *            执行流程:
 *              先判断比较表达式返回值是truefalse
 *              true: ---->> 执行表达式1;
 *              false: ---->> 执行表达式2;
 *
 *          switch 选择结构
 *     循环结构
 *
 *
 */

public class day11_demo2 {
    public static void main(String[] args){

       int a = 10;
       int b = 50;
       int c = 30;
       int max;


       if(a>b){
           if(a>c){
               max = a;
           }else {
                max = c;
           }
       }else if(b>c){
                max = b;
           }else {
           max = c;
       }

      int max2=a>b?((a>c)? a: c): ((b>c)? b:c);

       System.out.println("max: " + max);
       System.out.println("======================");
       System.out.println("max2: " + max2);
    }
}