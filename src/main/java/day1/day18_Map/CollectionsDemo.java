package day1.day18_Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(60);

        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,20));
        System.out.println(Collections.max(list));
//        Collections.reverse(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
