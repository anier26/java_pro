package day1.lesson5;

/**
 * 面向对象的开发,设计,特征:
 *    就是不断的创建对象,使用对象,指挥对象做事情
 *
 * 面向对象设计:
 *    管理和维护对象间的关系
 *
 * 类: 是一组相关的属性和行为的集合,是一个抽象的概念
 * 对象: 是该类事物的具体表现形式,具体存在的个体
 *
 * 面向对象的特征:
 *    封装
 *    继承
 *    多态
 *
 * 成员变量: 在类中方法外 --->>全局变量
 * 成员方法,不带static
 *
 */

public class ClassDemo1 {
    public static void main(String[] args){

        Student student = new Student();
//        student.addr = "杭州";
//        student.name = "aha";
//        student.age = 23;

        student.eat();
        student.study();
        student.sleep();

//        System.out.println(student.addr + student.name + student.age);
    }
}
