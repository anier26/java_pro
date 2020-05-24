package day1.lesson1;

/**
 * 控制跳转语句:
 *    break: 中断
 *    continue: 继续
 *    return: 返回
 *
 * break: 中断
 * 使用场景:
 *    switch语句中
 *    循环语句中
 *      在循环语句中加入了if,满足条件后停止循环,break即可
 *    break 离开使用场景则没有使用意义
 *
 */

public class day13_class4 {
    public static void main(String[] args) {
       for (int x=0; x<10; x++){
           if(x == 2){
               break;
           }
           System.out.println("hello"); // 打两次hello，x = 2时退出for循环
       }
       System.out.println("over"); //break退出单次循环后后面的程序还是会继续执行;


        System.out.println("====================");
    }
}