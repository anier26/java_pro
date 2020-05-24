package day1.lesson10;

/**
 * 成员内部类:
 *    如何直接反问内部类成员:
 *    外部类名.内部类名 对象名 = 外部类对象.内部类对象;
 *
 * 成员内部类的修饰符:
 *    private 为了吧保证数据的安全性
 *    static 注意,静态内部类访问的外部类数据必须是静态修饰
 *           被静态修饰的内部类中可以有静态和非静态方法
 *
 *    被static就是后的内部类格式:  --- >>为了方便访问数据
 *    外部类名.内部类名 对象名 = new 外部类名.内部类名()
 *    Outer.Inner oi = new Outer.Inner();
 *
 */

class Outer1{
    private int num =10;
    public static int num2 =20;

    class Inner1{
        public void show(){
            System.out.println(num);
        }
    }

    static class Inner2{
        public void show(){
            System.out.println(num2);
        }

        public static void method(){
            System.out.println(num2);
        }

    }
}

public class InnerDemo2 {
    public static void main(String[] args){
        Outer1.Inner1 oi = new Outer1().new Inner1();
        oi.show();

        Outer1.Inner2 oi2 = new Outer1.Inner2();
        oi2.method();
        oi2.show();

        //静态内部类的静态方法的另一种调用:
        Outer1.Inner2.method();
    }
}
