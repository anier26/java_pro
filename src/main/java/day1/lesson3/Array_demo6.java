package day1.lesson3;


/**
 * 数组: 存储同一种数据类型的多个元素的容器;
 * 数组提供了一个属性,获取数组的长度;
 * 格式: 数组名.length
 * arr.length
 *
 */


public class Array_demo6 {
    public static void main(String[] args) {

        int[] arr={21,13,68,37,52,79};
        int max = arr[0];
        for (int x=1; x<arr.length; x++){
            if(arr[x] > max){
                max = arr[x];
            }
        }
        System.out.println("max: " + max);
        System.out.println(" ====================== ");

        int result = getMax(arr);
        System.out.println("result: " + result);
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
}

