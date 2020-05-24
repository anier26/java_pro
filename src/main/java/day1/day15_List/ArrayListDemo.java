package day1.day15_ArrayList;

import day1.lesson5.Student;

public class ArrayListDemo {
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

        for (int x=0; x<students.length; x++){
            System.out.println(students[x].getName() + "===" + students[x].getAddr());
        }

    }
}
