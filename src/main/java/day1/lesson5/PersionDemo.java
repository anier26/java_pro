package day1.lesson5;

/**
 * satic特点:
 *     随着类的加载而加载
 *     可修饰成员变量和成员方法
 *     优先对象存在
 *     被类的所有对象共享
 *     被静态修饰的成员可以直接通过类名调用
 *     静态方法只能访问静态成员变量和静态成员方法
 *
 *     静态方法:
 *        成员变量: 只能访问静态成员变量
 *        成员方法: 只能访问静态成员方法
 *
 *     非静态方法:
 *        成员变量: 可以是静态,也可以是非静态;
 *        成员方法: 可以是静态成员变量,也可以是非静态成员方法
 *
 *   就是静态只能访问静态,非静态可以访问一切方法
 *
 *
 静态修饰的内容一般称其为与类相关的
 *
 */

public class PersionDemo {

    public static void main(String[] args){

        Persion p1 = new Persion("aha",12,"hz");
        Persion p2 = new Persion("anan",21,"bj");
        Persion p3 = new Persion("quanyi",31,"hk");

        p1.show();
        p2.show();
        p3.show();

        System.out.println("===============");
        System.out.println("========static 修饰成员变量国家,所有成员共享=======");

        p1.setCountry("usa");

        p1.show();
        p2.show();
        p3.show();




    }
}
