package day1.lesson7;

/**
 * 子类中所有的构造方法默认都会访问父类中的空参构造方法
 * 不论子类创建对象时使用的是带参构造还是无参构造,使用super()空参,默认都是访问父类空参
 * 当子类使用super(..)带参时,默认访问的就是父类的带参构造
 *
 *
 * 也可以通过super(参数)去显示的调用父类的带参构造方法
 * 子类中一定要有一个构造先去访问了父类的构造方法,否则父类数据就没有进行初始化
 *
 * 注意:
 *    super(...) 和this(...) 在构造中使用,必须出现在第一条语句位置
 *
 */

class Father1{
    public Father1(){
        System.out.println("我是父亲");
    }

    public Father1(int a){
        System.out.println("我是父亲带参构造");
    }

}

class Son1 extends Father1{
    public Son1(){
        super(); //使用super()以后先访问访问了父类构造方法

        System.out.println("我是儿子");
    }


    public Son1(int a){
        super(a);  // 当super()方法中有参数时,走的是父亲带参构造
        System.out.println("我是儿子带参构造");
    }
}

public class ExtendsDemo5 {
    public static void main(String[] args){
//        Son1 s1 = new Son1();  //我是父亲   我是儿子
//        Son1 s2 = new Son1(1); //我是父亲  我是儿子带参构造

//        System.out.println("================");
//        //使用super(...)带参
        Son1 s3 = new Son1(1);

    }
}
