package day1.lesson3;


/**
 * 数组: 存储同一种数据类型的多个元素的容器;
 * 数组提供了一个属性,获取数组的长度;
 * 格式: 数组名.length
 * arr.length
 *
 */


public class Array_demo8 {
    public static void main(String[] args) {

        int[] arr={21,13,68,37,52,79};

        int index = printIn(arr,23);
        System.out.println(index);
    }

    public static int printIn(int[] arr,int value) {
        int index = -1;

        for (int x = 0; x < arr.length; x++) {
            if (value == arr[x]) {
                index = x;
            }
        }
        return index;
    }
}

