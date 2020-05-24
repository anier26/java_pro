package day1.lesson10;

/**
 *
 * 局部内部类访问局部变量注意事项:
 *    局部内部类访问局部啊变量必须用final修饰
 *
 */
class Outer2{
    private int num =10;
    public void method(){

        final int num2=20;  //局部内部类访问局部变量,必须用final修饰

        class Inner{
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }
        }

        Inner inner = new Inner();
        inner.show();
    }
}


public class InnerDemo3 {
    public static void main(String[] args){
        Outer2 outer2 = new Outer2();
        outer2.method();
    }
}
