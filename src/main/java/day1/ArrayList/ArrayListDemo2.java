package day1.ArrayList;

import day1.lesson5.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "aha1", "hz1");
        Student s2 = new Student(2, "aha2", "hz2");
        Student s3 = new Student(3, "aha3", "hz3");
        Student s4 = new Student(4, "aha4", "hz4");
        Student s5 = new Student(5, "aha5", "hz5");

        ArrayList arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);

        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            Student stu= (Student) it.next();
            System.out.println(stu.getName() + "=========" + stu.getAge());
        }

        System.out.println("=================");
        for (int x=0; x<arrayList.size(); x++){
            Student stu = (Student) arrayList.get(x);
            System.out.println(stu.getName() + "=========" + stu.getAge());
        }
    }
}
