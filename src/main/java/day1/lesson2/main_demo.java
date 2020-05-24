package lesson2;

/**
 * 方法:完成特定功能的代码块:
 *
 * 方法格式:
 *    修饰符 返回值类型 方法名(参数类型 参数名1, 参数类型 参数名2...){
 *         方法体语句;
 *         return 返回值;
 *
 *    }
 *
 * 修饰符;
 * 返回值类型: 功能结果的数据类型
 * 参数:
 *  实际参数: 实际参与运算的
 *  形式参数: 就是方法上定义的,用于接收实际参数的
 * 参数类型: 就是参数的数据类型
 * 变量名: 变量的名
 * 方法体语句: 就是完成功能的代码
 * return: 用来结束方法的
 *
 * 返回值: 就是功能的结果,由return带给调用者
 *
 */

public class main_demo {
    public static void main(String[] args){

        int sum = getSum(10,20);
        System.out.println("sum: " + sum);
    }


    public static int getSum(int a, int b){
        return a+b;
    }
}
