package day1.lesson4;

/**
 * 二维数组: 元素为一维数组的数组;
 *
 * 格式: 数据类型[][] 数组名 = new 数据类型[m][n];
 * m:表示二维数组有多少个一维数组
 * n:表示每个一维数组的个数
 *
 * 注意: 以下格式也可以表示二维数组
 *  数据类型 数组名[][] = new 数据类型[m][n];
 *
 */
public class Array2Demo {
    public static void main(String[] args){
        int[][] arr = new int[3][2];
        System.out.println(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);

    }
}
