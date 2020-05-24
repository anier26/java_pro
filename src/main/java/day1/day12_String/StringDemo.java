package day1.day12_String;

public class StringDemo {
    public static void main(String[] args){
        String s = "helloWorld";
        System.out.println("s.length(): " + s.length());
        System.out.println("chartAt(): " + s.charAt(2));  //l,012
        System.out.println("indexof: " + s.indexOf("o")); //4
        System.out.println("indexof str:" + s.indexOf("llo")); //2
        System.out.println("indexof int ch " + s.indexOf("o",2));

        System.out.println("substring: " + s.substring(5)); //包含起始位置到结尾
        System.out.println("substring: " + s.substring(0)); //helloWorld
        System.out.println("substring: " + s.substring(3,8)); //loWor 3-7不包end

    }
}
