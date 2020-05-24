package day1.day15_List;

import day1.lesson5.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo10 {
    public static void main(String[] args){
        Student student1 = new Student(1,"aha1","hz1");
        Student student2 = new Student(2,"aha2","hz2");
        Student student3 = new Student(3,"aha3","hz3");
        Student student4 = new Student(4,"aha4","hz4");
        Student student5 = new Student(5,"aha5","hz5");

        Student[] students = new Student[5];
        students[0] =student1;
        students[1] =student2;
        students[2] =student3;
        students[3] =student4;
        students[4] =student5;

        List list = new ArrayList();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        Iterator it = list.iterator();

        while (it.hasNext()){
            Student student = (Student) (it.next());
            System.out.println(student.getName() + "=====" + student.getAddr());
        }

        for(int x=0; x<list.size(); x++){
            Student student = (Student) (list.get(x));
            System.out.println(student.getName() + "=====" + student.getAge());
        }
    }
}
