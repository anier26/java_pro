package day1.lesson11;

/**
 * 直接输出一个对象的名称,其实就是调用该对象的toString()方法
 *
 *
 */

import day1.lesson5.Student;

public class ObjectDemo {
    public static void main(String[] args){
        Student s = new Student();
        System.out.println(s.hashCode());
        System.out.println(s.getClass().getName());
        System.out.println("=============");
        System.out.println(s.toString());
        System.out.println(s);
    }
}
