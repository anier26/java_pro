package day1.day12_String;

public class StringDemo2 {
    public static void main(String[] args){
        String s1 = new String("hello");  // 会在内存中创建两个对象
        String s2 = "hello";  //在内存中创建一个对象

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

    }
}
