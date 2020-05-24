package day1.day18_Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();

        map.put("aha","aha1");
        map.put("anan","anan1");
        map.put("bagege1","bagege1");

//
//        map.clear();
//        System.out.println("map: " + map);

//
//        System.out.println("remove: " + map.remove("anan"));
//        System.out.println("remove1: " + map.remove("anan1"));

//        System.out.println("containsKey: " + map.containsKey("aha"));
//        System.out.println("containsKey: " + map.containsKey("aha1"));

//        System.out.println("isEmpty: " + map.isEmpty());
//        map.clear();
//        System.out.println("isEmpty: " + map.isEmpty());

        System.out.println("size: " + map.size());
        System.out.println("map: " + map);




    }
}
