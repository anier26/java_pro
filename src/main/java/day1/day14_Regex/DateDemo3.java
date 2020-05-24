package day1.day14_Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) throws ParseException {
        //Data --- >> String
        Date date = new Date();
        //如果使用SimpleDateFormat的无参构造,那么simpleDateFormat调用farmat方法时,
        //使用的就是simpleDateFormat自带的格式默认输出
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String time = simpleDateFormat.format(date);
        System.out.println(time);

        //原来设定格式化的规则是在使用SimpleDateFormat的构造方法时直接传入的,这样得到的SimpleDateFormat对象
        //就是已经设定好格式的对象,然后再通过format()方法去格式化date对象

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        String time1 = simpleDateFormat1.format(date);
        System.out.println(time1); //2020-03-69 00:18:38


        //吧一个String对象解析成一个date对象:
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        Date date2 = simpleDateFormat2.parse(time1);
        System.out.println("date2: " + date2);
    }
}
