package day1.lesson9;

/**
 * 接口的成员特点:
 *    成员变量: 在接口中的成员变量,只能是静态常量
 *        public int num = 10 --- >>这里隐含了 final 和static  <-- 这个java默认存在
 *        在接口中就相当于 public static final int num = 10;  成员变量,永远建议这样写
 *    构造方法:
 *          接口没有构造方法,因为所有的类都默认继承至object类,该类是个超类
 *    成员方法:
 *        接口中只能有抽象方法,不存在非抽象方法
 *        而且,接口中所有的成员方法都隐含了 public abstract ...
 *
 *
 * java中类与类,类与接口的关系:
 * 类与类:
 *     类与类之间,只能单继承,但可以多层级继承 (爷爷 -->> 爸爸 -->> 儿子) 一层一层继承可以形成继承体系
 *
 * 类与接口:  --- >>实现多个接口时,对应的接口要调对应的方法
 *    接口可以单实现,也可以多实现,可以单继承多实习(就是继承单个类,实现多个接口)
 *    class Intermpl extends Object implements Inter,Inter2{
 *        重写实现的两个接口的抽象方法即可
 *    }
 *      class Intermpl extends Object implements Inter,Inter2
 *
 * 接口和接口:
 *     接口和接口中是继承关系,可以继承单个接口,也可以继承多个接口
 *     interface Inter3 extends Inter{}
 *     interface Inter3 extends Inter,Inter2{}  //接口和接口继承关系
 *
 * 接口和抽象类的区别:
 *     抽象类:
 *         成员变量: 可以是变量,也可以是常量
 *         构造方法: 有
 *         成员方法: 可以是抽象,也可以是非抽象
 *     接口:
 *         成员变量: 值可以是静态常量 默认隐含: public static final
 *         成员方法: 只可以是抽象方法: 隐含public abstract
 *
 *     关系区别:
 *        类与类:
 *           继承,单继承
 *        类与接口
 *           实现,单实现,多实现 class Intermpl extends Object implements Inter,Inter2
 *        接口与接口:
 *           继承,单继承,多继承
 *
 *  设计理念不同
 *      抽象类: 被继承体现的是 is a 的关系  --- >> 抽象类中定义的是该继承体系中的共性功能
 *      接口:  被实现体现的是: "like a"的关系 --- >> 接口中定义的是该继承体系中待拓展的功能
 *             相当于,它本身并不具备某种功能,但随着时间推移,它可能会具备某种功能
 *
 *
 */

interface Inter{
    public static final int num  = 10;

//    public void show(){};
}

interface Inter2{
    public void method();
}


interface Inter3 extends Inter,Inter2{}  //接口和接口继承关系

class Intermpl extends Object implements Inter,Inter2{
    public void method(){
        System.out.println("method");
    }
}


public class InterfaceDemo2 {
    public static void main(String[] args){

        Intermpl intermpl = new Intermpl();
        intermpl.method();
        System.out.println(intermpl.num);
        System.out.println("=================");

        Inter inter = new Intermpl();
        System.out.println(inter.num);

        Inter2 inter2 = new Intermpl();
        inter2.method();  // 因为这个method是在inter2接口,所以i2的引用才能调用
        ((Intermpl) inter).method();


    }
}
