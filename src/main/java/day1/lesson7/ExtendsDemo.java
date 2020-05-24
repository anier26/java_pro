package day1.lesson7;


/**
 * 继承概述:
 *    吧多个类中相同的内容给提取出来定义到一个类中
 *
 * 格式:
 *     class 子类名 extends 父类名{}
 *
 * 继承作用:
 *    提高了代码复用性
 *    提高了代码的可维护性
 *    让类与类之间产生了联系,是多态的前提
 *
 * 开发原则: 低耦合,高内聚
 * 耦合: 类与类的关系
 * 内聚: 就是自己完成某件事情的能力;
 *
 * java中类的继承:类只支持单继承;
 *              java中虽然不支持多继承,但是支持多层级继承,就是,爸爸继承爷爷的,儿子继承爸爸的,
 *              爷爷--->> 爸爸 --- >>儿子 可以形成一个继承体系
 *
 *
 *
 */

class Person {
    public void eat (){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}

class Student extends Person { }
class Teacher extends Person { }

public class ExtendsDemo {

    public static void main(String[] args){
        Person p = new Person();
        Student stu = new Student();
        Teacher tc = new Teacher();

        stu.sleep();
        stu.eat();

        tc.eat();
        tc.sleep();
    }
}
