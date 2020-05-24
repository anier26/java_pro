package day1.lesson2;

/**
 * 方法重载:
 *    在同一个类中,方法名相同,参数列表不同,与返回值类型无关
 *
 *    参数列表不同:
 *       参数个数不同;
 *       参数类型不同;
 *
 *
 */

public class main_demo8 {
    public static void main(String[] args) {
        byte a=1;
        byte b =2;

        short s1=1;
        short s2 =2;

        boolean flag1 = compared(a,b);
        boolean flag2 =compared(s1,s2);
        boolean flag3 =compared(2,2);
        boolean flag4 =compared(1.0f,2);

        System.out.println("flag: "+ flag1);
        System.out.println("flag: " +flag2);
        System.out.println("flag: "+ flag3);
        System.out.println("flag: " + flag4);
    }


    public static boolean compared(short a, short b){

        return  a==b;
    }
    public static boolean compared(int a, int b){ return  a==b; }
    public static boolean compared(float a, float b){ return  a==b; }
    public static boolean compared(byte a, byte b){ return  a==b; }
}
