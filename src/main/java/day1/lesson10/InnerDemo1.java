package day1.lesson10;

/**
 * 吧类定义在其他类的内部,这个类就被称为内部类
 * 举例: 在类A中定义了一个类B,类B就是内部类
 *
 * 内部类的访问特点:
 *    内部类可以直接访问外部类的成员,包括私有
 *
 * 外部类访问内部类成员,必须创建对象
 *
 * 内部类的位置:
 *    成员位置: 在成员位置定义的类,称为成员内部类
 *    局部位置: 在局部位置定义的类,称为局部内部类
 *
 * 成员内部类:
 *    如何直接访问内部类的成员
 *    外部类.内部类  对象名 = 外部类对象.内部类对象;
 *
 */


class Outer{
    private int num = 10;

    class Inner{
        public void show(){
            System.out.println(num);
        }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }

}


public class InnerDemo1 {
    public static void main(String[] args){

        Outer outer = new Outer();
        outer.method();
    }

}
