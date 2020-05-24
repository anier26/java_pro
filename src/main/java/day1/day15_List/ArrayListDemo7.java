package day1.day15_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo7 {
    public static void main(String[] args) {

        Collection collection = new ArrayList();
        collection.add("hello");
        collection.add("world");
        collection.add("java");
        collection.add("java");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            String str = (String) iterator.next();
            System.out.println(str);
        }
     System.out.println("===================");
        for (int x=0; x<collection.size(); x++){
            String str = (String) (((ArrayList) collection).get(x));
            System.out.println(str);
        }
     }
}
