package day1.lesson7;

/**
 * 继承的注意事项:
 *    子类只能继承父类非私有的成员(成员方法或者成员变量)
 *    子类不能继承父类的构造方法,但是可以通过super关键字去访问父类构造方法
 *    继承体现的是一种is a的关系
 *
 *    继承中成员变量的关系:
 *        子类中的成员变量和父类中的成员变量名称不一样,正常使用
 *        子类中的成员变量和父类中的成员变量名称一样,则子类中的成员变量覆盖父类的成员变量
 *
 *
 */

class Father {
    public int num = 10;
}
class Son extends Father{
    public int num2 = 20;
    public int num = 30;

    public void show(){
        //变量的使用采用就近原则:
        int num = 50;

        System.out.println(num);
        System.out.println(num2);
    }
}

public class ExdentsDemo2{
    public static void main(String[] args){
        Son s  = new Son();

//        s.show(); // 10, 20, 当子类成员变量和父类成员不一致时,正常打印

//        s.show(); // 30,20 当子类成员变量和父类成员变量一直时,打的是子类自己的成员变量

        //变量的使用采取就近原则:
        s.show(); // 50 ,20
    }
}
