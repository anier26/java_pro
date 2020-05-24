package day1.day17_Set;

import day1.lesson5.Student;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args){
        HashSet<Student> hashSet = new HashSet<>();

        Student s1 = new Student(27,"aha","hz");
        Student s2 = new Student(27,"aha","hz");
        Student s3 = new Student(21,"aha","hz");
        Student s4 = new Student(21,"aha1","hz");
        Student s5 = new Student(27,"aha1","hz1");


        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);

        for(Student stu: hashSet){
            System.out.println(stu.getName()+"==="+ stu.getAge() + "===" + stu.getAddr());
        }
    }
}
