package day1.day15_List;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println("c: " + c);

//        c.clear();
//        System.out.println("c: " + c);

//        c.remove("java");
//        System.out.println("c: " + c);

        System.out.println(c.contains("javaEE"));
        System.out.println(c.contains("java"));
        System.out.println(c.isEmpty());
        System.out.println(c.size());

    }
}
