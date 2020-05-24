package day1.day15_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){

        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("world");
        list.add("java");
        list.add("world");
        list.add("java");
        list.add("world");
        list.add("java");

//        list.add(1,"javaEE");  //原来1索引处的元素后移,支持末尾连续索引追加
//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            String str = (String) it.next();
//            System.out.println("str: " + str);
//        }

//        System.out.println(list.get(1));
        System.out.println(list.remove(1)); //javaEE 删除并返回被删除的元素
        System.out.println(list.remove(list.get(1))); //javaEE 删除并返回被删除的元素
//        System.out.println(list.set(1,"JAVAEE")); //返回被修改的元素
        System.out.println(list);

    }
}
