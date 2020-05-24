package day1.day14_Regex;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args){

        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
//        System.out.println((System.currentTimeMillis()));

        System.out.println("date: " + date);
        date.setTime(System.currentTimeMillis());
        System.out.println("date: " + date);
    }
}
