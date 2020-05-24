package day1.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import static day1.ArrayList.ArrayListDemo3.prinList;

/**
 * 方式二:不造新集合去重
 *
 */

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
//        arrayList.add("world");
//        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("android");
        arrayList.add("java");
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("good");
        arrayList.add("good");
        arrayList.add("good");
        arrayList.add("good");
        arrayList.add("java");
        arrayList.add("hello");
        arrayList.add("aha");
        arrayList.add("world");

        for(int x=0; x<arrayList.size()-1; x++) {
            for (int y = x+1; y <arrayList.size(); y++) {
                if ((arrayList.get(x)).equals(arrayList.get(y))) {
                    arrayList.remove(y);  //每次当后面相同的元素被移除后,后面元素的索引都往前移了1
                    y--; // 所以y--;
                }
            }
        }

        prinList(arrayList);
    }
}
