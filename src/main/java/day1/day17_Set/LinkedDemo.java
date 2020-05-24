package day1.day17_Set;

import java.util.LinkedHashSet;

public class LinkedDemo {
    public static void main(String[] args){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();

        linkedHashSet.add("aha");
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");

        for(String str: linkedHashSet){
            System.out.println(str);
        }
    }
}
