package day1.lesson6;

/**
 * 代码块:
 *    在java中,使用{}括起来的代码被称为代码块
 *    根据其位置和声明的不同,可以分为局部代码块,构造代码块,静态代码块
 *
 *  局部代码块
 *  构造代码块
 *  静态代码块
 *
 *
 */

public class Code {

    /**
     * 构造代码块之间也按照先后顺序执行
     * 构造代码块优先于构造方法执行
     *
     *
     */

    static{
        int a = 10000;
        System.out.println(a);
    }

    //构造代码块
    {
        int x = 100;
        System.out.println(x);
    }

    //构造方法
    public Code(){
        System.out.println("code");
    }

    //带参构造
    public Code(int a){
        System.out.println("code");
    }

    //构造代码块
    {
        int y=200;
        System.out.println(y);
    }

    static{
        int a = 20000;
        System.out.println(a);
    }
}
