package day1.day18_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();

        map.put("aha","aha1");
        map.put("anan","anan1");
        map.put("hello","hello1");
        map.put("wold","world1");
        map.put("java","java1");

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.print(key+ " ");
            String value = map.get(key);
            System.out.println(value);
        }
    }
}
