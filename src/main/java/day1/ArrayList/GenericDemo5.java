package day1.ArrayList;

public class GenericDemo5 {
    public static void main(String[] args){
        InterImpl ii = new InterImpl();
        ii.show("aha");

        Inter<String> ii2 = new InterImpl();
        ii2.show("bagege");

        //实现接口未知类型:第二中i情况
        Inter iin = new InterImpl();
        iin.show("aha");
        iin.show(100);
        iin.show(true);
        iin.show('a');
    }
}
