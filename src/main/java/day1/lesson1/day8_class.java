package day1.lesson1;

/**
 * += 拓展运算符隐含了一个强制类型转换
 *
 * s += 1   ===>>等价于 s =(short)(s+1)
 */

public class day8_class {
    public static void main(String[] args){

        short s= 1;
//        s =s +1; 精度损失
        s += 1; // 拓展运算符隐含了一个强制类型转换
        System.out.println("s: " + s);


    }
}