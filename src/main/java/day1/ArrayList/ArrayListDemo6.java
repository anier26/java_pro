package day1.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 通过asList(array) 转成的list集合,其本质还是数组,数组长度是固定的,
 * 所以转成list集合后不能改变长度,但可以修改元素
 *
 *
 *
 */

public class ArrayListDemo6 {
    public static void main(String[] args) {
//        String[] array = {"hello", "world", "java"};
//        List<String> list = Arrays.asList(array);


        //可变参数模式:
//        List<String> list = Arrays.asList("hello");
//        List<String> list = Arrays.asList("hello","world");
        List<String> list = Arrays.asList("hello","world","java");

        for(String str: list){
            System.out.println(str);
        }
    }
}
