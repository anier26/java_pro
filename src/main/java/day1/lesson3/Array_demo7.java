package day1.lesson3;


/**
 * 数组: 存储同一种数据类型的多个元素的容器;
 * 数组提供了一个属性,获取数组的长度;
 * 格式: 数组名.length
 * arr.length
 *
 */


public class Array_demo7 {
    public static void main(String[] args) {

        int[] arr={21,13,68,37,52,79};
        printarrs(arr);
        System.out.println(" ====================== ");
        printArr(arr);
        printarrs(arr);

    }

    public static void printarrs(int[] arr){
        System.out.print("[");
        for (int x=0; x<arr.length; x++){
            if(x == arr.length-1){
                System.out.println(arr[x] + "]");
            }else {
                System.out.print(arr[x] + ", ");
            }
        }
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int x=0; x<arr.length; x++){
            if (arr[x] > max){
                max = arr[x];
            }
        }
        return max;
    }

    public static void printArr(int[] arr){
        for (int x=0; x<arr.length/2; x++){
            int tmp = arr[x];
            arr[x] = arr[arr.length-1-x];
            arr[arr.length-1-x] = tmp;
            }
        }
}

