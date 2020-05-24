package day1.lesson5;

/**
 *
 * 形式参数:
 *    基本类型: 形式参数的改变不影响实际参数;
 *    引用类型: 形式参数的改变直接影响实际参数
 *
 *
 * 匿名对象: 没有名字的对象:
 *
 * 匿名对象应用场景:
 *     调用方法,仅仅只调用一次时可以考虑匿名对象;
 *
 * private: 私有的,可以修饰的成员变量和成员方法,
 *          被private修饰的成员只能在本类中被访问
 *
 * 封装:是指隐藏对象的属性和实现细节,仅对外提供公共访问方式
 *
 * this:代表所在类的对象引用
 * 使用场景:解决局部变量隐藏成员变量
 *
 */

public class ClassDemo2 {
    public static void main(String[] args) {
        Student s = new Student();
//        s.show();
//        s.method(new Student());
//        new Student().show();


        s.setAge(19);
        s.setName("aha");
        s.setAddr("杭州");

        s.show();
    }
}
