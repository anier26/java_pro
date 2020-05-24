package day1.day18_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();

        map.put("aha","aha1");
        map.put("hello","hello1");
        map.put("world","world1");
        map.put("java","java1");
//
//        System.out.println("get: " + map.get("aha"));
//        System.out.println("get: " + map.get("aha1s"));

        Set<String> key = map.keySet();
        for(String key_n : key){
            System.out.print(key_n + " ");
            String value = map.get(key_n);
            System.out.println(value);
        }

        System.out.println("=============");
        Collection<String> values = map.values();
        for(String value: values){
            System.out.println(value);
        }
    }
}
