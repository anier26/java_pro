package day1.lesson1;

/**
 * while循环
 *
 * 初始化语句;
 * while(判断条件语句:){
 *     循环体语句;
 *     控制条件语句;
 * }
 * 等价for循环:
 * for(初始化语句;判断条件语句;控制条件语句){
 *      循环体语句;
 * }
 *
 */

public class day13_class2 {
    public static void main(String[] args) {

        for(int x=0; x<=1; x++){
            System.out.println("hello world");
        }
        System.out.println("+++++++++++++");

        int y=0;
        while (y<5){
            System.out.println("hello");
            y++;
        }
    }
}