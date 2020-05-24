package day1.day12_String;

public class StringDemo7 {
    public static void main(String[] args) {
        String s = "helloWORLD";
        //方式一:
//        for (int x = 0; x < s.length(); x++) {
//            if (x == 0) {
//                String str = String.valueOf(s.charAt(x)).toUpperCase();
//                System.out.print(str);
//            }
//        else {
//                String str2 = String.valueOf(s.charAt(x)).toLowerCase();
//                System.out.print(str2);
//            }
//        }

        String s1 = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println("s1: " + s1);
    }
}
