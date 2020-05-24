package day1.lesson4;

/**
 * 二维数组: 元素为一维数组的数组;
 *
 * 格式二:
 *    数据类型[][] 数组名 = new 数据类型[m][];
 *    m 表示一维数组个数,每个一维数组个数没有给出可以动态给出;
 *
 * 二维数组的静态初始化:
 *
 * 数据类型[][] 数组名 = {{元素1, 元素2, 元素3...},{元素1,元素2,...},
 *                      {元素1,元素2,元素3,元素4,元素5...}};
 *
 * 举例:
 * int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
 * int[][] arr = {{1,2,3},{4,5},{6}};
 *
 */
public class Array2Dem3 {
    public static void main(String[] args){

        int[][] arr = {{1,2,3},{4,5},{6}};

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);

        System.out.println(arr[2][0]);



    }
}
