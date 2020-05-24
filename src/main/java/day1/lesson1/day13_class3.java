package day1.lesson1;

/**
 * do...while循环语句:  --- >>先执行一次循环体,在判断条件是否满足
 *  do{
 *      循环体语句;
 *  }while(判断条件语句);
 *
 * 拓展格式:
 * 初始化语句;
 * do{
 *     循环体语句;
 *     控制条件语句;
 * }while(判断条件语句);
 *
 *
 *
 * do ... while 循环,至少执行一次循环体
 * for ,while 循环都是必须先判断条件是否成立,然后决定是否执行循环体语句
 */

public class day13_class3 {
    public static void main(String[] args) {
        int x=0;
        do{
            System.out.println("hello world");
            x++;
        }while (x<10);


        int sum =0;
        int y =0;
        do {
            sum += y;
            y++;
        }while (y<=100);
        System.out.println("sum: " +sum);
    }
}