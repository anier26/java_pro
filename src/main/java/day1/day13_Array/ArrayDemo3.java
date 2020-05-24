package day1.day13_Array;

import static day1.day13_Array.ArrayDemo.printArray;
import static day1.day13_Array.ArrayDemo2.switchSort;

public class ArrayDemo3 {
    public static void main(String[] args) {
        String str = "dacgebf";
        char[] ch = str.toCharArray();

        switchSort(ch);
        printArray(ch);
    }
}
