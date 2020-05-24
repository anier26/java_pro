package day1.lesson8;

/**
 *
 * 多态前提:
 *    要有继承关系;
 *    要有方法重写;
 *    要有父类引用指向子类对象;
 *      父 f = new 子();
 *
 * 多态中成员变量访问特点:
 *     成员变量:编译看左边,运行看左边,就是如果子类和父类的成员边量相同
 *            那么父类引用访问的成员变量是自己的,因为父类引用是不能访问儿子的变量的
 *            那么把父类引用还原成儿子的对象时((Zi)fu).num --- >>这个时候父类引用已经还原成儿子了
 *            那么在访问num变量时,根据就近原则,访问的就是儿子自己的了
 *     构造方法:
 *        创建子类对象的时候,会优先访问父类的构造方法,对父类数据进行初始化
 *     成员方法:
 *        儿子的成员方法和父亲一样,则儿子重写父亲,不一样儿子特有,只有儿子自己可以调用
 *
 *     静态方法:
 *         子类方法重写时不能覆盖父类,所以类引用调用的静态方法还是自己的
 *
 *   多态的好处:
 *      提高了代码的可维护性
 *      提高了代码的拓展性
 *
 *
 */

class Fu{

    public int num =100;
    public void show(){
        System.out.println("show Fu");
    }

    public static void Function(){
        System.out.println("Function Fu");
    }
}

class Zi extends Fu{

    public int num =1000;
    public void show(){
        System.out.println("show Zi");
    }

    public void method(){
        System.out.println("method Zi");
    }

    public static void Function(){
        System.out.println("Function Zi");
    }
}

public class DuotaiDemo {
    public static void main(String[] args){
        Fu fu = new Zi();
        fu.show();
        System.out.println(fu.num); // 100,
        fu.Function(); //Function Fu

//        fu.method();  父类引用不能调用儿子的特有方法,儿子想要调用自己的方法,需要变回儿子自己
        Zi zi = (Zi) fu;

        zi.method();
        ((Zi) fu).method();


    }
}
