package day1.lesson9;

/**
 * 接口的特点:
 *    接口用关键字interface表示
 *        interface 接口名{}
 *    类实现接口用implements表示
 *        class 类名 implements 接口名 {}
 *    接口不能实例化
 *       接口可以通过多态的方式来实例化;
 *
 *    接口的实现类:
 *       要么实现接口的类是一个抽象类
 *       要么非抽象类实现接口以后重写接口中的所有抽象方法
 *
 * 接口的成员特点
 *
 *
 * 多态的三种表现形式:
 *    具体类多态
 *    抽象类多态
 *    接口多态
 *
 */

interface AnimalTrain{
    public abstract void jump();
}

abstract class Dog2 implements AnimalTrain{

}

class Dog3 implements AnimalTrain{
    public void jump(){
        System.out.println("狗调高");
    }
}

public class InterfaceDemo {
    public static void main(String[] args){
        AnimalTrain at = new Dog3();
        at.jump();

        Dog3 d3 = new Dog3();
        d3.jump();

    }
}
