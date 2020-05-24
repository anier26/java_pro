package day1.day13_Array;

import java.util.Arrays;

import static day1.day13_Array.ArrayDemo.printArray;

/**
 * Arrays工具
 *
 * public static String toString(int[] a)
 * public static void sort(int[] a)
 * public static int binarySearch(int[] a,int key)
 *
 */

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {11, 77, 66, 55, 22, 33};

        String str = Arrays.toString(arr);
        System.out.println("str: " + str);

        Arrays.sort(arr);
//        printArray(arr);
        System.out.println("str: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr,33);
        System.out.println("index: " + index);
    }
}
