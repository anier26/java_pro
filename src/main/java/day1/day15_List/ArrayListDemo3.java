package day1.day15_ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add("abc1");
        collection1.add("abc2");
        collection1.add("abc3");
        collection1.add("abc4");

        Collection collection2 = new ArrayList();
        collection2.add("abc1");
        collection2.add("abc2");
        collection2.add("abc3");
        collection2.add("abc4");
        collection2.add("abc5");
        collection2.add("abc6");
        collection2.add("abc7");

        System.out.println(collection1);
        System.out.println(collection2);

//        System.out.println("addAll: " + ((ArrayList) collection1).addAll(collection2));
//        System.out.println(collection1); //[abc1, abc2, abc3, abc4, abc5, abc6, abc7]
//        System.out.println(collection2); //[abc5, abc6, abc7]
//
//        //removeAll: 吧自己和对方相同的元素全都移除了;
//        System.out.println("removeAll: " + ((ArrayList) collection1).removeAll(collection2));
//        System.out.println(collection1); //[abc1, abc2, abc3]
//        System.out.println(collection2); //[abc4, abc5, abc6, abc7]

        //包含对方所有的元素才能算containsAll
        System.out.println("containsAll: " + collection1.containsAll(collection2));

        // 找出调用者与被调用者共有的元素并返回给collection1,返回的状态表示collection1调用者是否发生过改变
        // 当调用者collection1的元素在collection2中都有时,那么返回的元素abc1-4和collection1本来有的元素
        // 是一样的,所以collection1没有发生过改变,返回的状态就是false

        System.out.println("retainAll: " + collection1.retainAll(collection2));
        System.out.println(collection1);
        System.out.println(collection2);
    }
}
