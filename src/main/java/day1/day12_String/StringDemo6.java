package day1.day12_String;

public class StringDemo6 {
    public static void main(String[] args){
        String s = "Hello123World";

       byte[] bye = s.getBytes();  //字节类型
       for(int x=0; x<bye.length; x++){
           System.out.print((char) bye[x]);
       }
       System.out.println();
       System.out.println("==================");
       char[] chs = s.toCharArray();
       for (int x=0; x<s.length(); x++){
           System.out.print(chs[x]);
       }
        System.out.println();
       System.out.println("==================");
       String str = String.valueOf(chs);
       for (int x=0; x<str.length(); x++){
           System.out.print(str.charAt(x));
       }
        System.out.println();
        System.out.println("str: " + str);

        int i = 100;
        String ss = String.valueOf(i);
        System.out.println(ss);  //字符串100

        String str2 = s.toLowerCase();
        System.out.println(str2);

        String str3 = s.toUpperCase();
        System.out.println(str3);
    }
}
