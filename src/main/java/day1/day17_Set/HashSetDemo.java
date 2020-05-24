package day1.day17_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet();
        hashSet.add("aha");
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("world");
        hashSet.add("java");

        for(String str: hashSet){
            System.out.println(str);
        }
    }
}
