package day1.lesson1;

/**
 * a --- >> 97 a-z连续递增
 * A --- >> 65 A-Z连续递增
 * 0 --- >> 48 0-9连续递增
 *
 */


public class day4_class {
    public static void main(String[] args){
        char chr = 'A';
        System.out.println(chr); //A
        System.out.println(chr + 1); // 66
        System.out.println((char)(chr + 1)); // B
        System.out.println("============");

        char chr2 = '0';
        System.out.println(chr2); //0 字符0
        System.out.println(chr2+1); // 49
        System.out.println((char)(chr2+1)); // 1 这里是字符1


    }
}
