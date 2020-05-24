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

public class day11_demo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的成绩");
        int score = sc.nextInt();

        if(score<0 || score>100){
            System.out.println("学生成绩不合法");
        }
        if(score >=0 && score<60){
            System.out.println("不及格");
        }
        if(score >=60 && score<70){
            System.out.println("及格");
        }
        if(score >=70 && score<80){
            System.out.println("良好");
        }
        if(score >=80 && score<90){
            System.out.println("优-");
        }
        if(score >=90 && score<100){
            System.out.println("优秀");
        }else if(score == 100){
            System.out.println("恭喜你,满分满分！");
        }
    }
}