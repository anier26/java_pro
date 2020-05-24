package day1.day14_Regex;

import java.util.Scanner;

public class RegexDemo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入qq:");
        String str = sc.nextLine();
        String regex = "1[38]\\d{9}";

        boolean flag = str.matches(regex);
        System.out.println(flag);
    }

}