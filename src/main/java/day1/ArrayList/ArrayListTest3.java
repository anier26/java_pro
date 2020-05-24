package day1.ArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 通过asList(array) 转成的list集合,其本质还是数组,数组长度是固定的,
 * 所以转成list集合后不能改变长度,但可以修改元素
 */

public class ArrayListTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){
            System.out.println("请录入数据: ");
            int num = sc.nextInt();
            if (num == 0){
                break;
            }
            arrayList.add(num);
        }

        int max=arrayList.get(0);
        for(int x=1; x<arrayList.size()-1; x++){
            if(arrayList.get(x) > max){
                max = arrayList.get(x);
            }
        }
        System.out.println("max: " + max);

        for(Integer ii: arrayList){
            System.out.println(ii);
        }
    }
}
