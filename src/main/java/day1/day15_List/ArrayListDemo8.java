package day1.day15_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo8 {
    public static void main(String[] args) {

       List list = new ArrayList();

       list.add("hello");
       list.add("world");
       list.add("java");
       list.add("java");

       Iterator iterator = list.iterator();

       while (iterator.hasNext()) {
           System.out.println((String) (iterator.next()));
       }
    }
}
