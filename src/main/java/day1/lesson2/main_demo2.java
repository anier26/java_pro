package day1.lesson2;

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

public class main_demo2 {
    public static void main(String[] args){

        int sum = getSum(10,20);
        System.out.println("sum: " + sum);
    }


    public static int getSum(int a, int b){
        return a+b;
    }
}
