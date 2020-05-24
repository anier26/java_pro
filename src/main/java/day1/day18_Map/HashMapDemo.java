package day1.day18_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args){

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("it_001","aha");
        hashMap.put("it_002","hello");
        hashMap.put("it_003","java");
        hashMap.put("it_004","world");
        hashMap.put("it_005","anan");

        Set<String> keys = hashMap.keySet();
        for(String key: keys){
            System.out.print(key+ " ");
            String value = hashMap.get(key);
            System.out.println(value);
        }
        System.out.println("================");
        //拿到一个map对象:
        Set<Map.Entry<String,String>> maps  = hashMap.entrySet();
        for(Map.Entry<String,String> map: maps){
            String key = map.getKey();
            String value = map.getValue();
            System.out.println("key: " + key + "===" + "value: " + value);
        }
    }
}
