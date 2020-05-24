package day1.lesson9;

/**
 * 抽象类:
 *    我们吧一个不是具体的功能称为抽象的功能,而一个类中如果有抽象功能,那么这个类必须是抽象类
 *
 *
 * 抽象类特点:
 *    抽象类和抽象方法必须使用abstract修饰,
 *    抽象类中不一定有抽象方法,但是有抽象方法的类必须定义为抽象类
 *    抽象类不能实例化,因为它不是具体的
 *
 * 注意注意:!!! 抽象类有构造方法,但是不能实例化;
 *             这里的构造方法是提供给将来子类访问父类数据时进行初始化;
 *
 *  抽象类的子类:
 *     要么继承抽象类的子类是一个抽象类
 *     要么继承抽象类的子类,必须重写父类中所有的抽象方法
 *
 * 抽象类的实例化: 通过多态的方式
 *      Animal a = new Dog();  dog就是Animal的一个实例, dog中重写Animal中的所有抽象方法即可;
 *
 *
 *
 * 抽象类的成员特点:
 *    成员变量: 即可以是变量,也可以是常量
 *        public int num=10;
 *        public final int num2=20;
 *    构造方法: 有,用于子类访问父类数据初始化:
 *    成员方法: 有,即可以是非抽象方法,也可以是抽象方法,抽象方法必须被子类重写
 *
 * 抽象类成员方法特性:
 *     抽象方法: 继承该抽象类时,强制子类要做的事
 *     非抽象方法: 子类继承该类以后,继承该类的功能,提高代码复用性
 *
 */

abstract class Animal{
    public int num=10;
    public final int num2=20;


    public Animal(){}
    public Animal(String name,int age){
    }

    public abstract void show();

    public void method(){
        System.out.println("method");
    }
}

class Dog extends Animal{
    public void show(){
        System.out.println("狗");
    }
}

class Cat extends Animal{
    public void show(){
        System.out.println("猫");
    }
}



public class AbstractDemo {
    public static void main(String[] args){

        Animal a = new Dog();
        System.out.println(a.num);
        System.out.println(a.num2);
        a.show();
        a.method();
    }
}
