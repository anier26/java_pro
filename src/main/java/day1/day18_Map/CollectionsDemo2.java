package day1.day18_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args){

        Stu stu1 = new Stu(1,"aha1");
        Stu stu2 = new Stu(2,"aha2");
        Stu stu3 = new Stu(3,"aha3");
        Stu stu5 = new Stu(1,"aha1");

        List<Stu> arrayList = new ArrayList();
        arrayList.add(stu1);
        arrayList.add(stu2);
        arrayList.add(stu3);
        arrayList.add(stu5);

        System.out.println(arrayList);
        Collections.sort(arrayList);

        for(Stu stu: arrayList){
            System.out.println(stu.getName() + "===" + stu.getAge());
        }
    }
}
