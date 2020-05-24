package day1.day14_Regex;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class DateDemo5 {
    private static String regex = "YYYY-MM-DD";
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生年月: ");
        String birthday = sc.nextLine();
        long days = getBirthDay(birthday);
        System.out.println("您来到这个世界: " + days + "天");
    }

    private static long getBirthDay(String birthday) throws ParseException {
        long time = new Date().getTime();
        long birthTime =  DateUtil.getParse(birthday,regex).getTime();
        long daytTime = time-birthTime;

        System.out.println(time);
        System.out.println(birthTime);
        System.out.println(daytTime);
        long days = daytTime/1000/60/60/24;

        return days;
    }
}
