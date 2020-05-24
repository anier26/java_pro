package day1.lesson1;

import java.util.Scanner;

/**
 *
 *
 */

public class day13_demo2 {
    public static void main(String[] args) {
        int count =0;
        for(int x=100; x<1000; x++){
            if((x%10)*(x%10)*(x%10) +(x/10%10)*(x/10%10)*(x/10%10)
                    + (x/10/10%10)*(x/10/10%10)*(x/10/10%10) == x){
                count ++;
                System.out.println(x);
            }
        }
        System.out.println("共有: " + count);
    }
}