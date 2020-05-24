package day1.lesson5;

/**
 * 构造方法:
 *     给类中成员的数据进行初始化
 *
 * 格式:
 *      方法名与类名相同
 *      没有返回值类型,连void也没有
 *      没有具体的返回值
 *
 * 构造方法注意事项:
 *    如果我们没有给出构造方法,那么系统将自动给出一个无参构造方法
 *    如果我们自己手动给出了构造方法,那么系统将不再给出默认的无参构造方法
 *        不管我们给的是带参还是无参构造,只要我们给了,系统就不给了
 *
 * 给成员变量赋值:
 *  setXxx()
 *  构造方法赋值
 *
 *
 */

public class ConstructDemo {
    public static void main(String[] args) {

        Student2 s2 = new Student2();
        s2.show();

        Student2 s2_1 = new Student2("haha",19);
//        System.out.println("s2_1: " +s2_1);
        s2_1.show();


        //标准版:
        System.out.println("===================");
        System.out.println("===================");

        Student s = new Student(); // 无参构造 + setX()给成员变量赋值
        s.setAge(11);
        s.setName("巴哥哥");
        s.setAddr("beijing");

        System.out.println("age: " + s.getAge() + "---" + "name: " + s.getName()
                +"---"+"addr: "+ s.getAddr());

        System.out.println("============");
        Student ss1 = new Student(11,"anan","tianjin");
        ss1.show();
    }
}
