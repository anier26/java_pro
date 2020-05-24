package day1.lesson3;


/**
 * 数组: 存储同一种数据类型的多个元素的容器;
 *
 *
 * 格式:
 *      数据类型[] 数组名;
 *      数据类型 数组名[];
 *
 *      int[] a 定义一个int 类型的数组a变量
 *      int a[] 定义一个int 类型a数组变量
 *
 * 注意:效果是一样的都是定义一个int数组;
 *
 *
 * 数组初始化:
 *     为数组开辟内存空间,并为每个数组元素赋予初始化值
 *
 * 动态初始化; --->> 只指定长度,由系统给出初始化值
 *     格式: 数据类型 数组名 = new 数据类型[数组长度];
 *     int[] arr = new int[2];
 * 静态初始化; --->> 给出初始化值,由系统决定长度
 *
 * 索引就是数组元素的长度,从0开始,最大索引为数组长度减1
 *
 *
 */


public class Array_demo2 {
    public static void main(String[] args){

        int[] arr = new int[3];

        System.out.println("arr:" + arr);
        System.out.println("arr[0]:" + arr[0]);
        System.out.println("arr[1]:" + arr[1]);
        System.out.println("arr[2]:" + arr[2]);

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println("arr:" + arr);
        System.out.println("arr[0]:" + arr[0]);
        System.out.println("arr[1]:" + arr[1]);
        System.out.println("arr[2]:" + arr[2]);
    }
}

