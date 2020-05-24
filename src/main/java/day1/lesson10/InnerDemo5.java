package day1.lesson10;

/**
 * 匿名内部类:
 *    就是内部类的简化写法
 * 前提:存在一个类或者接口
 *    这里的类可以是具体类也可以是抽象类
 * 格式: new 类名或者接口名(){
 *     重写方法;
 * }
 *
 * 本质是什么?
 *    是一个继承了还类或实现了该接口逇子类匿名对象;
 *
 *
 *
 */
interface Inters{
    public abstract void show();
}

class Outer3{
    public void method(){
        new Inters(){
            public void show(){
                System.out.println("show");
            }
        }.show();
    }
}

public class InnerDemo5 {
    public static void main(String[] args){

        Outer3 outer3 = new Outer3();
        outer3.method();
    }
}
