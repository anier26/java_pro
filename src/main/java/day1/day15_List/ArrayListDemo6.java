package day1.day15_ArrayList;

import day1.lesson5.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo6 {
    public static void main(String[] args) {

        Collection collection = new ArrayList();
        Student student1 = new Student(1, "aha1", "hz1");
        Student student2 = new Student(2, "aha2", "hz2");
        Student student3 = new Student(3, "aha3", "hz3");
        Student student4 = new Student(4, "aha4", "hz4");
        Student student5 = new Student(5, "aha5", "hz5");


        collection.add(student1);
        collection.add(student2);
        collection.add(student3);
        collection.add(student4);
        collection.add(student5);


        Iterator i =collection.iterator();
        while (i.hasNext()){
            Student student = (Student) i.next();
            System.out.println(student.getName() + "===" + student.getAddr()
                    + "===" + student.getAge());
        }

//        System.out.println("===============");
//        for(Iterator it = collection.iterator(); it.hasNext();){
//            Student s = (Student) it.next();
//            System.out.println(s.getName() + "===" + s.getAddr()
//                    + "===" + s.getAge());
//        }
    }
}
