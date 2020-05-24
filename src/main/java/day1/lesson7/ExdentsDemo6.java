package day1.lesson7;

/**
 * 子类中的方法名和父类中的方法声明不一样
 *
 * 子类中的方法名和父类中的方法声明一样
 *    先看子类中有没有这个成员方法,如果有就直接用
 *    如果子类没有再看父类中有没有这个方法
 *    子类父类都没有就报错
 */

class Father2{
    public void show(){
        System.out.println("我是show()");
    }
}

class Son2 extends Father2{
    public void method(){
        System.out.println("我是method()");
    }

    public void show(){
        method();
    }
}

public class ExdentsDemo6 {
    public static void main(String[] args){
        Son2 s2 = new Son2();
//        s2.show(); // 我是show()
//        s2.method(); // 我是method()

        //子类中的成员方法和父类中的成员方法声明一样:
        s2.show();  //我是method()
        s2.method(); //我是method()
    }
}
