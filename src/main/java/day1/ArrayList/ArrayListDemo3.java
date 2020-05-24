package day1.ArrayList;

import day1.lesson5.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("android");
        arrayList.add("java");
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("good");

//
        ArrayList arrayList1 = new ArrayList();
//        for (int x = 0; x < arrayList.size(); x++) {
//            if(!arrayList1.contains(arrayList.get(x))){
//                arrayList1.add(arrayList.get(x));
//            }
//        }
//       prinList(arrayList1);

        //while版:
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String str = (String) iterator.next(); //先把str获取出来,在判断新集合里有没有
            if(!arrayList1.contains(str)){
                arrayList1.add(str);
            }
        }
        prinList(arrayList1);
    }

    public static void prinList(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            String str = (String) (it.next());
            System.out.println(str);
        }
    }
}
