package day1.day14_Regex;

public class SystemDemo {
    public static void main(String[] args){
        String str = "abc";
//        str = null;
//        System.gc();

        System.out.println(System.currentTimeMillis());
        long start = System.currentTimeMillis();
        for(int x=0; x<10000; x++){
            System.out.println("hello" + x);
        }

        long end = System.currentTimeMillis();
        System.out.println("共耗时: " + (end - start) + "毫秒");
    }

}
