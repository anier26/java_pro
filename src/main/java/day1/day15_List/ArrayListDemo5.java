package day1.day15_ArrayList;

import day1.lesson5.Student;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo5 {
    public static void main(String[] args){
        Collection collection = new ArrayList();
        Student student1 = new Student(1,"bage1","hz1");
        Student student2 = new Student(1,"bage2","hz2");
        Student student3 = new Student(1,"bage3","hz3");
        Student student4 = new Student(1,"bage4","hz4");
        Student student5 = new Student(1,"bage5","hz5");

        collection.add(student1);
        collection.add(student2);
        collection.add(student3);
        collection.add(student4);
        collection.add(student5);

        Object[] obj = collection.toArray();

        for(int x=0; x<obj.length; x++){
            Student student = (Student) obj[x];
            System.out.println(student.getName() + "===" + student.getAddr() + "===" + student.getAge());

        }
    }
}
