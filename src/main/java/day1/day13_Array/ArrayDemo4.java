package day1.day13_Array;

import static day1.day13_Array.ArrayDemo.printArray;
import static day1.day13_Array.ArrayDemo2.switchSort;

public class ArrayDemo4 {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        
        System.out.println(getIndex(arr,77));
    }

    private static int getIndex(int[] arr, int value) {
        int min = 0;
        int max = arr.length-1;
        int mid = (min + max)/2;
        while (arr[mid] != value){
            if(arr[mid] > value){
                max = max -1;
            }else if(arr[mid] < value){
                min = mid +1;
            }
            mid = (max+min)/2;

            if(max < min){
                return -1;
            }
        }
        return mid;
    }
}
