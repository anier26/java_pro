package day1.day14_Regex;

import java.util.Scanner;

/**
 *
 *
 *
 * 5-10位数字
 * 0不能开头
 */

public class RegexDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入qq:");
        String str = sc.nextLine();
        System.out.println(getQQNum(str));
    }

    private static boolean getQQNum(String str) {
        boolean flag = true;
        System.out.println(str);
        if(str.length() >= 5 && str.length() <=12){
            if(!str.startsWith("0")){
                for (int x=0; x<str.length(); x++){
                    if(!(Character.isDigit(str.charAt(x)))){
                        flag = false;
                        break;
                    }
                }
            }else {
                flag = false;
            }
        }else {
            flag = false;
        }
        return flag;
    }
}
