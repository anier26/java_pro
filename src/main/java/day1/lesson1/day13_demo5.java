package day1.lesson1;

/**
 * 珠穆朗玛峰8848m,一张足够大的纸厚度为0.01m,折多少次可以保证厚度不低于珠峰高度 ?
 *
 */

public class day13_demo5 {
    public static void main(String[] args) {
        int highth = 884800;
        int z_high = 1;
        int count = 0;

        while (true){
            z_high *=2;
            count ++;
            if(z_high >= highth){
                System.out.println(z_high);
                break;
            }
        }
        System.out.println("count: " +count);
    }
}