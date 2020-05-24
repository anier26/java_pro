package day1.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args){

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("bage");

//        for (String str : arrayList) {
//            System.out.println(str);
//        }
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
