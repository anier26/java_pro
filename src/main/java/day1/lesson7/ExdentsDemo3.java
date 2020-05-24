package day1.lesson7;


/**
 * super和this分别是什么?
 *      this 代表本类对象的引用
 *      super 代表父类存储空间的标识,相当于父类对象引用,可以操作父类成员
 *
 * 区别:
 *     调用成员变量:
 *        this.成员变量   调用本类的成员变量
 *        super.成员变量  调用父类的成员变量
 *     调用构造方法:
 *        this(...) 调用本类的构造方法
 *        super(...) 调用父类的构造方法
 *      调用成员方法:
 *          this.成员方法,调用本类的成员方法
 *          super.成员方法 调用父类的成员方法
 *
 *
 */


class Fathers{
    public int num = 10;
}

class Sons extends Fathers{

    public int num = 20;
    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}

public class ExdentsDemo3{
    public static void main(String[] args){
        Sons s = new Sons();
        s.show();
    }
}
