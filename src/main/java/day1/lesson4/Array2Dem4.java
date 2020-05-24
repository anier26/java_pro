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
public class Array2Dem4 {
    public static void main(String[] args){

        int[][] arr= {{11,22,33},{35,67,12},{23,87,76}};
        printArray2(arr);

    }

    public static void printArray2(int[][] arr){
        for (int x=0; x<arr.length; x++){
            System.out.print("[");
            for (int y=0; y<arr[x].length; y++){
                if(y == arr[x].length -1){
                    System.out.println(arr[x][y]+"]");
                }else {
                    System.out.print(arr[x][y] + ", ");
                }
            }
            System.out.println();
        }
    }
}
