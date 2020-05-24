package day1.lesson4;

/**
 * 二维数组: 元素为一维数组的数组;
 *
 * 格式二:
 *    数据类型[][] 数组名 = new 数据类型[m][];
 *    m 表示一维数组个数,每个一维数组个数没有给出可以动态给出;
 *
 */
public class Array2Dem2 {
    public static void main(String[] args){
        //定义数组:
        int[][] arr = new int[3][];

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]); // null 二维数组的元素是一维数组,一维数组是引用类型,未初始化前,默认值为ull
        System.out.println(arr[2]);

        //动态的为每一个一维数组分配空间;
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[6];

        System.out.println(arr[0]); //[I@4554617c 动态初始化后,一维数组有初始值
        System.out.println(arr[1]); //[I@74a14482
        System.out.println(arr[2]); //[I@1540e19d


        System.out.println(arr[0][0]); //
        System.out.println(arr[0][1]); //

        System.out.println(arr[1][0]); //
        System.out.println(arr[1][1]); //
        System.out.println(arr[1][2]); //

        System.out.println(arr[2][0]); //
        System.out.println(arr[2][1]); //
        System.out.println(arr[2][2]); //
        System.out.println(arr[2][3]); //
        System.out.println(arr[2][4]); //
        System.out.println(arr[2][5]); //


        arr[1][0] = 100;
        arr[2][3] = 200;
        System.out.println(arr[1][0]);
        System.out.println(arr[2][3]);



    }
}
