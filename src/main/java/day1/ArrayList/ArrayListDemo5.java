package day1.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import static day1.ArrayList.ArrayListDemo3.prinList;


public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("aha");
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("bagege");

        Iterator<String> it =  arrayList.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("=================");

        for(String str: arrayList){
            System.out.println(str);
        }

        System.out.println("=================");

        for(int x=0; x<arrayList.size(); x++){
            String str = arrayList.get(x);
            System.out.println(str);
        }
    }
}
