package day1.lesson1;

/**
 *
 *
 * 整数默认int
 * 小数默认double
 *
 * 长整形后缀用L标记
 * 单精度浮点数用F标记
 *
 * 变量作用域问题:
 *    变量定义在哪个大括号内,就在哪个大括号内有效
 *    并且,在同一个大括号内不能同时定义两个同名变量
 *    没有初始化值得变量不能直接使用
 *    只需在使用前给变量赋值即可
 *
 *
 *
 *
 */

public class day2_class {
    public static void main(String[] args){
        long num = 6000000000L;
        System.out.println(num);

        int num2 = (int) num;
        System.out.println("=================");
        System.out.println("num2: " + num2);

        short s = 1;
//        s = s+1; short + int 发生自动类型转换,转为int
        s = (short) (s+1);
        System.out.println(s);

    }

}
