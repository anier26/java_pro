package day1.day15_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo9 {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("java");

        for (int x=0; x<list.size(); x++){
            String str = (String) (list.get(x));
            System.out.println(str);
        }
    }
}
