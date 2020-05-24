package day1.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();

        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("bagege");

        for(int x=0; x<arrayList.size(); x++){
            String str = (String) (arrayList.get(x));
            System.out.println("str: " + str);
        }
        System.out.println("===============");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String str = (String) (iterator.next());
            System.out.println("str: " + str);
        }
    }
}
