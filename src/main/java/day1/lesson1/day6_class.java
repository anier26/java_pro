package day1.lesson1;

/**
 * 强制类型转换: 取值范围大的数据或变量不能直接赋值给取值范围小的类型变量, 需要进行强制类型转换
 *
 * 格式:
 *      目标数据类型 变量 = (目标数据类型) 被转换的数据
 */

public class day6_class {
    public static void main(String[] args){
       byte b = (byte) 130; //-126

       System.out.println(b);
    }
}