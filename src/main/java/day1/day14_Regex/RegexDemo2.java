package day1.day14_Regex;

import java.util.Scanner;

/**
 *
 *
 *
 * 5-10位数字
 * 0不能开头
 */

public class RegexDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入qq:");
        String str = sc.nextLine();
        System.out.println(getQQNum(str));
    }

    private static boolean getQQNum(String str) {
//        String regex = "[1-9][0-9]{5,12}";
//        return str.matches("[1-9][0-9]{5,12}");
        return str.matches("[1-9]\\d{5,12}");
    }
}
