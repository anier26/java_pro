package day1.day13_Integer;

public class IntegerDem2 {
    public static void main(String[] args){
        //int --- >> String
        int ii = 100;
        //方式一: 字符串的valueOf()方法可以把任意类型转为String
        String str1 = String.valueOf(ii);
        System.out.println("str1: " + str1); //100

        //方式二: 拼接
        String str3 = "" + ii;
        System.out.println("str3: " + str3); //100

        //方式三: toString();
        Integer i = new Integer(100);
        String str5 = i.toString();
        System.out.println("str5: " + str5);

        //方式4:
        String str =Integer.toString(ii); //直接通过toString() 转一个int
        System.out.println("str: " + str); //100

        //String ----- >> int
        int iii = Integer.valueOf(str);
        System.out.println("iii: " + iii);

        int iii1 = new Integer(str1);
        System.out.println("iii1: " + iii1);

        Integer ii2 = new Integer(str3);
        int iii2 = ii2.intValue();
        System.out.println("iii2: " + iii2);

        int iii3 = Integer.parseInt(str5);  
        System.out.println("iii3: " + iii3);



    }
}
