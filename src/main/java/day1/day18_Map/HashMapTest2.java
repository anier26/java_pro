package day1.day18_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest2 {
    public static void main(String[] args) {

        HashMap<String, ArrayList> hashMap = new HashMap<>();

        ArrayList<String> arrayList1 = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        ArrayList<String> arrayList3 = new ArrayList();

        arrayList1.add("吕布");
        arrayList1.add("周瑜");
        arrayList2.add("令狐冲");
        arrayList2.add("林平之");
        arrayList3.add("郭靖");
        arrayList3.add("杨过");

        hashMap.put("三国演义",arrayList1);
        hashMap.put("笑傲江湖",arrayList2);
        hashMap.put("神雕侠侣",arrayList3);

        Set<String> book_name = hashMap.keySet();
        for(String names: book_name){
            System.out.println(names);
            ArrayList<String> namess =  hashMap.get(names);
            for(String name:namess){
                System.out.println("\t" + name);
            }
        }
    }
}
