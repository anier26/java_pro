package day1.ArrayList;

import day1.lesson5.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 通过asList(array) 转成的list集合,其本质还是数组,数组长度是固定的,
 * 所以转成list集合后不能改变长度,但可以修改元素
 */

public class ArrayListTest {
    public static void main(String[] args) {
        Student s1 = new Student(21,"aha1","hz1");
        Student s2 = new Student(22,"aha2","hz2");
        Student s3 = new Student(23,"aha3","hz3");
        Student s4 = new Student(24,"aha4","hz4");

        ArrayList<Student> arrayList = new ArrayList<>();
        //一班学生进班:
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        Student s5 = new Student(25,"anan","bj");
        Student s6 = new Student(26,"anan","bj");
        Student s7 = new Student(27,"anan","bj");
        Student s8 = new Student(28,"anan","bj");

        ArrayList<Student> arrayList2 = new ArrayList<>();

        //2班学生:
        arrayList2.add(s5);
        arrayList2.add(s6);
        arrayList2.add(s7);
        arrayList2.add(s8);

        //班级加入年级:
        ArrayList<ArrayList<Student>> arrayLists = new ArrayList<>();
        arrayLists.add(arrayList);
        arrayLists.add(arrayList2);

        for(ArrayList<Student> arrayList_class: arrayLists){
            for(Student student: arrayList_class){
                System.out.println(student.getName() + "===" + student.getAddr());
            }
        }
    }
}
