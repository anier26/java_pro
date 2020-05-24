package day1.lesson5;

import java.util.Objects;

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
 * 成员变量和局部变量的区别:
 * 1. 在类中的位置不同
 *      成员变量:在类中方法外
 *      局部变量:在方法定义中或者方法声明上
 * 2. 在内存中的位置不同
 *      成员变量: 在堆内存
 *      局部变量: 在栈内存
 * 3. 生命周期不同:
 *      成员变量: 随着对象的创建而存在,随着对象的消失而消失
 *      局部变量: 随着方法的调用而存在,方法调用完毕消失
 * 4. 初始化值不同:
 *      成员变量: 有默认初始化值
 *      局部变量: 没有默认初始化值,必须定义,赋值,然后才可以使用
 *
 * 局部变量名称可以和成员变量名称相同,在方法中使用时,采用就近原则
 *
 *
 */

public class Student {
    private int age;
    private String name ;
    private String addr;

    public Student(){}
    public Student(int age,String name,String addr){
        this.age = age;
        this.name = name;
        this.addr = addr;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddr(String addr){
        this.addr = addr;
    }

    public String getAddr(){
        return addr;
    }

    public void eat(){
        System.out.println("学生要吃饭");
    }


    public void sleep(){
        System.out.println("学生要睡觉");
    }

    public void study(){
        System.out.println("学生要学习");
    }


    public void show(){
        System.out.println("name: " + name + "---" + "age: " + age + "---" +"addr: " + addr);
    }


    public void method(Student s){
        show();
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getAddr(), student.getAddr());


    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), getAddr());
    }
}
