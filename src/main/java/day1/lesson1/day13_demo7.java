package day1.lesson1;

/**
 * 外循环控制行
 * 内循环控制列
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 *  ******
 */

public class day13_demo7 {
    public static void main(String[] args) {
        for (int y=0; y<6; y++){
            for (int x=0; x<=y; x++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}