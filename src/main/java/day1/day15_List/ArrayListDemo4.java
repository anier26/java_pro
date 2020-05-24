package day1.day15_ArrayList;

import day1.lesson5.Student;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo4 {
    public static void main(String[] args){

        Collection collection = new ArrayList();
        collection.add("hello");
        collection.add("world");
        collection.add("java");

        Object[] obj=collection.toArray();
        for (int x=0; x<obj.length; x++){
//            System.out.println(obj[x]);
            String str = (String) obj[x];
            System.out.println(str + "=====" +str.length());
        }

    }
}
