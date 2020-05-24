package day1.day18_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args){

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(11,"aha");
        hashMap.put(23,"anier");
        hashMap.put(39,"anan");
        hashMap.put(52,"hello");

        Set<Integer> keys = hashMap.keySet();
        for(Integer ii: keys){
            System.out.print(ii);
            String value = hashMap.get(ii);
            System.out.println(value);
        }

    }
}
