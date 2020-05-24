package day1.day18_Map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("hello","你哈");
        treeMap.put("world","世界");
        treeMap.put("java","爪哇");
        treeMap.put("EE","aha");

        Set<String> keys = treeMap.keySet();
        for(String str: keys){
            String value = treeMap.get(str);
            System.out.println(str + "===" + value);
        }

    }
}
