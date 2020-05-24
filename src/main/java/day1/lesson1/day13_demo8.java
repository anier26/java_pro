package day1.lesson1;

/**
 * 外循环控制行
 * 内循环控制列
 *  1*1=1
 *  1*2=2 2*2=4
 *  1*3=3 2*3=6  3*3=9
 *  1*4=4 2*4=8  3*4=12 4*4=16
 *  1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
 *  ...
 *  1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 ...9*9=81
 */

public class day13_demo8 {
    public static void main(String[] args) {
        for(int x=1; x<=3; x++){
            for (int y=1; y<=x; y++){
//                System.out.print("*");
                System.out.print(y + "*" + x + "=" +y*x + "\t");
            }
            System.out.println();
        }

        System.out.println("===========================");

        printStar(9);
    }

    public static void printStar(int m){
        for (int y=1; y<=m; y++){
            for (int x=1; x<=y; x++){
                System.out.print(x +"*"+ y +"="+x*y+"\t" );
        }
            System.out.println();
        }
    }
}