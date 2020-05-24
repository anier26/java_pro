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
 * 栈内存的两个引用指向同一个堆内存空间,不论他们谁的操作,都是针对同一个地址值得;
 */


public class Array_demo3 {
    public static void main(String[] args){

        int[] arr1 = new int[3];
        int[] arr2 = new int[2];
        int[] arr3 = arr1;

        arr1[0] = 88;
        arr1[1] = 33;
        arr1[2] = 66;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        arr2[0] = 55;
        arr2[1] = 22;
        System.out.println("================");
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);


        arr3[0] = 100;
        arr2[1] = 200;
        arr3[2] = 300;

        System.out.println("================");
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println("================");
        System.out.println("================");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

    }
}

