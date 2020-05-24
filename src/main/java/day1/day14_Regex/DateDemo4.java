package day1.day14_Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    private static String regex = "YYYY-MM-DD HH:mm:ss";
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        String time = DateUtil.getFormat(date,regex);
        System.out.println(time);

        Date date1 =DateUtil.getParse(time,regex);
        System.out.println(date1);
    }
}
