package day1.day14_Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private DateUtil(){}

    public static String getFormat(Date date,String regex){
        return getSimpleDateFormat(regex).format(date);
    }

    private static SimpleDateFormat getSimpleDateFormat(String regex) {
        return new SimpleDateFormat(regex);
    }

    public static Date getParse(String str,String regex) throws ParseException {
        return getSimpleDateFormat(regex).parse(str);
    }
}
