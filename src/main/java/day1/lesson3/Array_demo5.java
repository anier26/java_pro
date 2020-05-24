package day1.lesson3;


/**
 * 数组: 存储同一种数据类型的多个元素的容器;
 * 数组提供了一个属性,获取数组的长度;
 * 格式: 数组名.length
 * arr.length
 *
 */


public class Array_demo5 {
    public static void main(String[] args){

        int[] arr = {11,22,33,44,55,66};
        System.out.print("[");
        for(int x=0; x<arr.length; x++){
            if(x ==arr.length-1){
                System.out.println(arr[x] + "]");
            }else {
                System.out.print(arr[x] + ", ");
            }
        }
    }
}

