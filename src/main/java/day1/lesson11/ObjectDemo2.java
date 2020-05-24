package day1.lesson11;

/**
 * public boolean eauqls(Object obj): 指示按照其他某个对象是否与此对象相等
 *
 *
 * ==
 *   基本类型: 比较数据值是否相等
 *   引用类型: 比较对象的地址值是否相等
 *
 * equal:
 *      引用类型: 默认情况下,比较的是地址值
 *      不过我们可以根据情况自己重写,一般是自动生成,比较对象的成员变量是否相同
 *
 */

import day1.lesson5.Student;

public class ObjectDemo2 {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1==s2); //false

        Student s3 = s1;
        System.out.println(s1 == s3); //true

        Student s5 = new Student(1,"nana","hz");
        Student s6 = new Student(1,"nana","hz");
        Student s7 = new Student(3,"nana","hz");

        System.out.println(s5.equals(s6));
        System.out.println(s5.equals(s7));


    }
}
