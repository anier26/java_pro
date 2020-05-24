package day1.lesson3;


/**
 * 数组: 存储同一种数据类型的多个元素的容器;
 *
 * 静态初始化; --->> 给出初始化值,由系统决定长度
 *    格式: 数据类型[] 数组名 = new 数据类型[]{元素1,元素2,...}
           int[] arr = new int[]{1,2,3};
 *
 *    简化格式:
 *    数据类型[] 数组名 = {元素1,元素2,元素3};
 *      int[] arr = {1,2,3};
 */


public class Array_demo4 {
    public static void main(String[] args){

        int[] arr = {1,2,3};
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

