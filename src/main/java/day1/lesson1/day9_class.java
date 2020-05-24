package day1.lesson1;

/**
 * & 有false即false
 * | 有true即true
 * ^ 相同为false,不同为true
 * !
 */

public class day9_class {
    public static void main(String[] args){
        int a = 3;
        int b = 4;
        int c = 5;

        System.out.println((a>b) & (a > c)); //false
        System.out.println((a>b) & (a < c)); //false
        System.out.println((a<b) & (a > c)); //false
        System.out.println((a<b) & (a < c)); //true

        System.out.println("==================");

        System.out.println((a>b) | (a > c)); //false
        System.out.println((a>b) | (a < c)); //true
        System.out.println((a<b) | (a > c)); //true
        System.out.println((a<b) | (a < c)); //true

        System.out.println("==================");

        System.out.println((a>b) ^ (a > c)); //false
        System.out.println((a>b) ^ (a < c)); //true
        System.out.println((a<b) ^ (a > c)); //true
        System.out.println((a<b) ^ (a < c)); //false

        System.out.println("==================");

        System.out.println(!(a>b)); //false 取反! ---> true
        System.out.println(!(a < c)); //true 取反! ---> false
        System.out.println(!(a<b)); //true  取反! ---> false
        System.out.println(!(a > c)); //false 取反! ---> true


    }
}