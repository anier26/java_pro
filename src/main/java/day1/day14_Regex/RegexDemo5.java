package day1.day14_Regex;


import day1.day13_Array.ArrayDemo;

import java.util.Arrays;

public class RegexDemo5 {
    public static void main(String[] args) {

        String arr = "91,27,46,39,57";
        String[] array = arr.split(",");

        int[] array_int = new int[array.length];
        for (int x = 0; x < array.length; x++) {
            array_int[x] = Integer.parseInt(array[x]);
        }

        Arrays.sort(array_int);
        ArrayDemo.printArray(array_int);
    }
}