package day1.day13_Array;

import static day1.day13_Array.ArrayDemo.printArray;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        int[] arr2 = {33, 11, 5, 97, 21, 67, 31};

        switchSort(arr);
        switchSort(arr2);
//        for (int x=1; x<arr.length; x++){ //第一次
//            if(arr[x]<arr[0]){
//                int tmp = arr[x];
//                arr[x] = arr[0];
//                arr[0] = tmp;
//            }
//        }
////
//        for (int x=2; x<arr.length; x++){ //第二次
//            if(arr[x]<arr[1]){
//                int tmp = arr[x];
//                arr[x] = arr[1];
//                arr[1] = tmp;
//            }
//        }
//
//        for (int x=3; x<arr.length; x++){ //第三次
//            if(arr[x]<arr[2]){
//                int tmp = arr[x];
//                arr[x] = arr[2];
//                arr[2] = tmp;
//            }
//        }
//
//        for (int x=4; x<arr.length; x++){ //第四次
//            if(arr[x]<arr[3]){
//                int tmp = arr[x];
//                arr[x] = arr[3];
//                arr[3] = tmp;
//            }
//        }


        printArray(arr);
        printArray(arr2);

    }

    static void switchSort(int[] arr) {
        for(int y=0; y<arr.length-1; y++){
            for ( int x=y+1; x<arr.length; x++){
                if(arr[x]<arr[y]){
                    int tmp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = tmp;
                }
            }
        }
    }

    static void switchSort(char[] arr) {
        for(int y=0; y<arr.length-1; y++){
            for ( int x=y+1; x<arr.length; x++){
                if(arr[x]<arr[y]){
                    char tmp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = tmp;
                }
            }

        }
    }
}
