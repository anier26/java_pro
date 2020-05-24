package day1.ArrayList;

import day1.lesson5.Student;

import java.util.ArrayList;
import java.util.Random;

/**
 * 通过asList(array) 转成的list集合,其本质还是数组,数组长度是固定的,
 * 所以转成list集合后不能改变长度,但可以修改元素
 */

public class ArrayListTest2 {
    public static void main(String[] args) {
        int count =0;
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList();

        while (count <10){
//            int num = (int)(Math.random()*20) +1;
            int num = random.nextInt(20) +1;
            if(!arrayList.contains(num)){
                arrayList.add(num);
                count++;
            }
        }

        for(Integer ii: arrayList){
            System.out.println(ii);
        }
    }
}
