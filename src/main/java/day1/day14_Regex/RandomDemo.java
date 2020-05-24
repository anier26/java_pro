package day1.day14_Regex;


import day1.day13_Array.ArrayDemo;

import java.util.Arrays;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {

        Random random = new Random();

//        for(int x=0; x<10; x++){
////            int num = random.nextInt();
////            System.out.println(num);
//            int num = random.nextInt(100); //含0,不含100,
//            System.out.println(num);
//        }

        Random random1 = new Random(111L); //给定种子以后每次产生的随机数都是相同的
        for(int x=0; x<10; x++){
            int num = random1.nextInt(100); //含0,不含100,
            System.out.println(num);
        }
    }
}