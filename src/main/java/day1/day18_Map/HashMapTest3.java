package day1.day18_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest3 {
    public static void main(String[] args) {

        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("周瑜","小乔");
        hashMap.put("郭靖","黄龙");
        hashMap.put("杨过","小龙女");
        hashMap.put("令狐冲","任盈盈");
        hashMap.put("林平之","岳灵珊");

        arrayList.add(hashMap);

        for(HashMap<String,String> hmp: arrayList){
            Set<String> names = hmp.keySet();
            for(String name: names){
                String value = hmp.get(name);
                System.out.println(name+ "   " + value);
            }
        }

    }
}
