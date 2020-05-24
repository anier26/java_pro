package day1.day17_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("aha");
        set.add("hello");
        set.add("world");
        set.add("java");

        for(String str: set){
            System.out.println(str);
        }
        System.out.println("===============");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println("str: " + str);
        }
    }
}
