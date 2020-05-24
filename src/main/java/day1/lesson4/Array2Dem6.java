package day1.lesson4;

import java.util.Scanner;

/**
 * 二维数组: 元素为一维数组的数组;
 *
 * 打印杨辉三角
 * *
 * **
 * ***
 * ****
 * *****
 *
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 *
 *
 * 思路,先把所有的元素都设置成1,在从元素中寻找规律,设置规律表达式;
 *
 */
public class Array2Dem6 {
    public static void main(String[] args){

//        int[][] arr= {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1},{1,5,10,10,5,1}};

        Scanner sc = new Scanner(System.in);
        System.out.println("杨辉三角数:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        printArray2(arr);


    }

    public static void printArray2(int[][] arr){
        for (int y=0; y<arr.length; y++){
            for(int x=0; x<=y; x++){
                arr[y][x] =1;
                //设置等式规律:
                for(int m=1; m<=y-1; m++){
                    if(y >= 2){
                        arr[y][m] = arr[y-1][m-1] + arr[y-1][m];
                    }
                }
                System.out.print(arr[y][x] + "\t\t");
            }
            System.out.println();
        }
    }

}
